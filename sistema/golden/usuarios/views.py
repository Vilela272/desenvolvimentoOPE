from django.shortcuts import render, redirect, get_list_or_404, get_object_or_404
from django.contrib.auth.models import User
from django.contrib import auth
from .models import Cliente

# Create your views here.

def cadastro(request):
    if request.method == 'POST':
        nome = request.POST['nome']
        sobrenome = request.POST['sobrenome']
        email = request.POST['email']
        email2 = request.POST['email2']
        senha = request.POST['password']
        senha2 = request.POST['password2']
        cep = request.POST['cep']
        endereco = request.POST['endereco']
        numero = request.POST['numero']
        estado = request.POST['estado']
        nascimento = request.POST['nascimento']
        cpf = request.POST['cpf']
        telefone = request.POST['telefone']
        celular = request.POST['celular']

        if not nome.strip():
            print('O campo nome não pode ficar em branco')
            return redirect('cadastro')

        if not sobrenome.strip():
            print('O campo sobrenome não pode ficar em branco')
            return redirect('cadastro')
        
        if not email.strip():
            print('O campo email não pode ficar em branco')
            return redirect('cadastro')

        if not email2.strip():
            print('O campo confirmação de email não pode ficar em branco')
            return redirect('cadastro')
        
        if not cep.strip():
            print('O campo cep não pode ficar em branco')
            return redirect('cadastro')
        
        if not endereco.strip():
            print('O campo endereco não pode ficar em branco')
            return redirect('cadastro')

        if not numero.strip():
            print('O campo numero não pode ficar em branco')
            return redirect('cadastro')

        if not estado.strip():
            print('O campo estado não pode ficar em branco')
            return redirect('cadastro')
        
        if not nascimento.strip():
            print('O campo data de nascimento não pode ficar em branco')
            return redirect('cadastro')

        if not celular.strip():
            print('O campo celular não pode ficar em branco')
            return redirect('cadastro')

        if senha != senha2:
            print('As senhas não são iguais')
            return redirect('cadastro')
        if User.objects.filter(email=email).exists():
            print('Email ja cadastrado')
            return redirect('cadastro')
        user = User.objects.create_user(username=nome, email=email, password=senha, first_name=nome, last_name=sobrenome)
        user.save()
        print('Usuário cadastrado com sucesso')
        return redirect('login')
    else:
        return render(request, 'usuarios/cadastro.html')

def login(request):

    if request.method == 'POST':
        email = request.POST['email']
        senha = request.POST['senha']

        if login == '' or senha == '':
            print('Os campos login e senha não podem ficar em branco')
            return redirect('login')
        print(login, email, senha)
        if User.objects.filter(email=email).exists():
            nome = User.objects.filter(email=email).values_list('username', flat=True).get()
            user = auth.authenticate(request, username=nome, password=senha)

            if user is not None:
                auth.login(request, user)
                print('login realizado com sucesso')
                return redirect('index')
    return render(request, 'usuarios/login.html')

def logout(request):
    auth.logout(request)
    return redirect('login')

def dashboard(request):
    if request.user.is_authenticated:
        return render(request, 'usuarios/dashboard.html')
    else:
        return redirect('index')

def cria_dados(request):

    if request.method == 'POST':
        nome = request.POST['nome']
        sobrenome = request.POST['sobrenome']
        email = request.POST['email']
        email2 = request.POST['email2']
        senha = request.POST['password']
        senha2 = request.POST['password2']
        cep = request.POST['cep']
        endereco = request.POST['endereco']
        numero = request.POST['numero']
        estado = request.POST['estado']
        nascimento = request.POST['nascimento']
        cpf = request.POST['cpf']
        telefone = request.POST['telefone']
        celular = request.POST['celular']

        user = get_object_or_404(User, pk=request.user.id)
        cliente = Cliente.objects.create(nome=user, sobrenome=sobrenome, email=email, email2=email2, senha=senha, senha2=senha2, cep=cep, endereco=endereco, numero=numero, estado=estado, nascimento=nascimento, cpf=cpf, telefone=telefone, celular=celular)
        cliente.save()
        return redirect('dashboard')
    else:
        return redirect(request, 'usuarios/index.html')

def enviar_email(request):
    return render(request, 'usuarios/email.html')
