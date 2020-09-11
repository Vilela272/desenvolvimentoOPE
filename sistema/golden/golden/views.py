from django.shortcuts import render, get_list_or_404, get_object_or_404
from .models import Product


# Create your views here.
def index(request):

    produtos = Product.objects.all()

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
