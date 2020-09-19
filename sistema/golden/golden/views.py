from django.shortcuts import render, get_list_or_404, get_object_or_404
from .models import Product

# Create your views here.
def index(request):

    produtos = Product.objects.order_by('categoria').filter(publicada=True)

    dados = {
        'produtos' : produtos
    }
    return render(request, 'index.html',  dados)

def produto(request, produto_id):

    produto = get_object_or_404(Product, pk=produto_id)

    produto_a_exibir = {
        'produto': produto
    }
    return render(request, 'produto.html', produto_a_exibir)

def sobre(request):
    return render(request, 'sobre.html')

def buscar(request):

    lista_produtos = Product.objects.order_by('-data_produto').filter(publicada=True)

    if 'buscar' in request.GET:
        nome_a_buscar = request.GET['buscar']
        if  buscar:
            lista_produtos = lista_produtos.filter(nome_produto__icontains=nome_a_buscar)

    dados = {
        'produtos' : lista_produtos
    }

    return render(request, 'buscar.html', dados)
