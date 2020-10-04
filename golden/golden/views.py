from django.shortcuts import render, get_list_or_404, get_object_or_404, redirect
from django.contrib import auth, messages
from .models import Product

# Create your views here.
def produto(request, produto_id):

    produto = get_object_or_404(Product, pk=produto_id)

    produto_a_exibir = {
        'produto': produto
    }
    return render(request, 'produtos/produto.html', produto_a_exibir)

def busca(request):

    lista_produtos = Product.objects.order_by('-data_produto').filter(publicada=True)

    if 'buscar' in request.GET:
        nome_a_buscar = request.GET['buscar']
        lista_produtos = lista_produtos.filter(nome_produto__icontains=nome_a_buscar)

    dados = {
        'produtos' : lista_produtos
    }

    return render(request, 'produtos/buscar.html', dados)

def sobre(request):
    return render(request, 'empresa/sobre.html')

def carrinho(request):
    if request.user.is_authenticated:
        return render(request, 'empresa/carrinho.html')
    return redirect('index')
