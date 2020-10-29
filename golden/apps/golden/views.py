from django.shortcuts import render, get_list_or_404, get_object_or_404, redirect
from django.contrib import auth, messages
from golden.models import Produto, Pedido, PedidoProduto
from categorias.models import Categoria
from django.core.paginator import Paginator, EmptyPage, PageNotAnInteger

# Create your views here.
def produto(request, slug, categoria_id):
    """
    Função produto, seleciona o produto por id, para mostrar no HTML
    OBS: Precisa de ajustes para mostrar o produto por determinada categoria
    """
    produtos = Produto.objects.filter(categoria__produto=categoria_id, publicada=True).order_by('-data_produto')

    paginator = Paginator(produtos, 6)
    page = request.GET.get('page')
    produtos_por_pagina = paginator.get_page(page)
    
    produto_a_exibir = {
        'produtos': produtos_por_pagina
    }
    return render(request, 'produtos/produto.html', produto_a_exibir)
    

def busca(request):
    """
    Função de busca, que realiza busca de determinado produto, que o usuário digitou
    """
    buscas = Produto.objects.order_by('-data_produto').filter(publicada=True)
    
    if 'buscar' in request.GET:
        nome_a_buscar = request.GET['buscar']
        buscas = buscas.filter(nome_produto__icontains=nome_a_buscar)
    
    paginator = Paginator(buscas, 6)
    page = request.GET.get('page')
    busca_por_pagina = paginator.get_page(page)

    dados = {
        'buscas' : busca_por_pagina
    }

    return render(request, 'produtos/buscar.html', dados)


def sobre(request):
    """
    Função que sobre.
    Quando o usuário clicar no botão Sobre nós, rediciona para a página sobre.html
    """
    return render(request, 'empresa/sobre.html')


def carrinho(request):
    if request.user.is_authenticated:
        return render(request, 'empresa/carrinho.html')

        if request.method != 'POST':
            return render(request, 'produtos/produto.html')
    
        if not request.user.is_authenticated:
            return render(request, 'usuarios/login.html')
        id_produto = request.POST['produto']
        
        try:
            pedido = Pedido.objects.get(usuario=request.user, status="Carrinho")
        except Pedido.DoesNotExist:
            pedido = Pedido(usuario=request.user, status="Carrinho")

        produto = Produto.objects.get(id=id_produto)
        quantidade = request.POST['quantidade']
        
        try:
            item = PedidoProduto.objects.get(pedido=pedido, produto=produto)
        except PedidoProduto.DoesNotExist:
            item = PedidoProduto(pedido=pedido, produto=produto, quantidade=0)
        
        item.quantidade += int(quantidade)
        pedido.save()
        item.save()
        
        dados = {
            'pedido': Pedido,
            'itens': PedidoProduto.objects.filter(pedido=pedido)
        }
        
        return render(request, 'empresa/carrinho.html', dados)
    
    messages.error(
                request, 'Desculpe! Mas você só pode inserir um produto ao carrinho se estiver logado.')
    return redirect('login')
