from django.shortcuts import render, redirect, get_list_or_404, get_object_or_404
from django.contrib.auth.models import User
from django.contrib import auth, messages, sessions
from django.http import HttpResponse
from .forms import UserForm, UserProfile, UserProfileForm
from golden.models import Produto

from django.core.mail import BadHeaderError, send_mail
from django.http import HttpResponse, HttpResponseRedirect
# Create your views here.


def cadastro(request):
    """
    Função para realizar cadastro de um novo usuário no sistema
    """
    if request.method == 'POST':
        print(request.POST)
        usuario = request.POST.get('username', None)
        if usuario is None:
            return redirect('cadastro')
        nome = request.POST['nome']
        sobrenome = request.POST['sobrenome']
        email = request.POST['email']
        email2 = request.POST['email2']
        senha = request.POST['password']
        senha2 = request.POST['password2']


        if (campo_vazio(usuario) or usuario == None):
            messages.error(
                request, 'ATENÇÃO!!! O campo usuário não pode ficar em branco')
            return redirect('cadastro')

        if campo_vazio(nome) or nome == None:
            messages.error(
                request, 'ATENÇÃO!!! O campo nome não pode ficar em branco')
            return redirect('cadastro')

        if campo_vazio(sobrenome) or sobrenome == None:
            messages.error(
                request, 'ATENÇÃO!!! O campo sobrenome não pode ficar em branco')
            return redirect('cadastro')

        if campo_vazio(email) or email == None:
            messages.error(
                request, 'ATENÇÃO!!! O campo email não pode ficar em branco')
            return redirect('cadastro')

        if campo_vazio(email2) or email2 == None:
            messages.error(
                request, 'ATENÇÃO!!! O campo confirmação de email não pode ficar em branco')
            return redirect('cadastro')

        if email_nao_sao_iguais(email, email2):
            messages.error(
                request, 'ATENÇÃO!!! O campo de e-mail e confirmação de e-mail não são iguais')
            return redirect('cadastro')

        if senhas_nao_sao_iguais(senha, senha2):
            messages.error(
                request, 'ATENÇÃO!!! O campo de senha e confirmação de senha não conferem')
            return redirect('cadastro')

        if User.objects.filter(email=email).exists():
            messages.error(
                request, 'ATENÇÃO!!! Este e-mail já está cadastrado')
            return redirect('cadastro')

        if User.objects.filter(username=usuario).exists():
            messages.error(
                request, 'ATENÇÃO!!! Este nome de usuário ja existe. Por favor, insira outro')
            return redirect('cadastro')
        user = User.objects.create_user(
            username=usuario, email=email, password=senha, first_name=nome, last_name=sobrenome)
        user.save()
        messages.success(request, 'Cadastro realizado com sucesso')
        return redirect('login')
    else:
        return render(request, 'usuarios/cadastro.html')


def login(request):
    """
    Função que faz a validação do login do usuário, 
    login é permitido com e-mail e senha
    """

    dados_cookie = {
        'email': request.COOKIES.get('email'),
        'senha': request.COOKIES.get('senha')
    }

    if request.method == 'POST':
        email = request.POST['email']
        senha = request.POST['senha']

        if campo_vazio(email) or campo_vazio(senha):
            messages.error(
                request, 'ATENÇÃO!!! Campo e-mail e/ou senha não podem ficar em branco')
            return redirect('login')

        if User.objects.filter(email=email).exists():
            nome = User.objects.filter(email=email).values_list(
                'username', flat=True).get()
            user = auth.authenticate(request, username=nome, password=senha)

            if user is not None:
                auth.login(request, user)
                response = redirect('meus_dados')
                response.set_cookie(key='email', value=email)
                return response
        if User.objects.filter(email=email).exists():
            messages.error(request, 'ATENÇÃO!!! E-mail e/ou senha inválidos')
        else:
            messages.error(
                request, 'ATENÇÃO!!! Este e-mail não está cadastrado')

        # django.http.HttpResponse
        response = render(request, 'usuarios/login.html')
        response.set_cookie(key='email', value=email)
        return response

    return render(request, 'usuarios/login.html', dados_cookie)


def logout(request):
    """
    Função que faz a validação do logout do usuário do sistema
    """
    auth.logout(request)
    return redirect('login')


def campo_vazio(campo):
    """
    Função que verifica se um determinado campo, de cadastro ou login está vazio
    """
    return not campo.strip()


def senhas_nao_sao_iguais(senha, senha2):
    """
    Função que verifica se as senha são diferentes para realizar o cadastro
    """
    return senha != senha2


def email_nao_sao_iguais(email, email2):
    """
    Função que verifica se os emails não são iguais para realizar o cadastro
    """
    return email != email2


def meus_dados(request):
    if request.user.is_authenticated:
        user = User.objects.get(pk=request.user.pk)
        user_form = UserForm(instance=user)

        try:
            user_profile = UserProfile.objects.get(user=user)
        except:
            user_profile = UserProfile()
            user_profile.user = user
            user_profile.save()

        profile_form = UserProfileForm(instance=user_profile)

        if request.method == 'POST':
            user_form = UserForm(request.POST)
            profile_form = UserProfileForm(request.POST)
            if user_form.is_valid() and profile_form.is_valid():
                user.first_name = user_form.cleaned_data['first_name']
                user.last_name = user_form.cleaned_data['last_name']
                user.save()

                user_profile.cpf = profile_form.cleaned_data['cpf']
                user_profile.address = profile_form.cleaned_data['address']
                user_profile.number = profile_form.cleaned_data['number']
                user_profile.address2 = profile_form.cleaned_data['address2']
                user_profile.city = profile_form.cleaned_data['city']
                user_profile.district = profile_form.cleaned_data['district']
                user_profile.state = profile_form.cleaned_data['state']
                user_profile.country = profile_form.cleaned_data['country']
                user_profile.zipcode = profile_form.cleaned_data['zipcode']
                user_profile.phone = profile_form.cleaned_data['phone']
                user_profile.save()

        context = {
            'user_form': user_form,
            'profile_form': profile_form,
            'user': user
        }

        return render(request, 'usuarios/meus_dados.html', context)
    return redirect('login')
