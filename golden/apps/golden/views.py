from django.shortcuts import render, get_list_or_404, get_object_or_404, redirect
from django.contrib import auth, messages
from golden.models import Produto, Pedido, PedidoProduto
from categorias.models import Categoria

from usuarios.forms import User, UserForm, UserProfile, UserProfileForm
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


def boleto_bradesco(request):
    """
    Função que sobre.
    Quando o usuário clicar no botão Sobre nós, rediciona para a página sobre.html
    """
    if request.user.is_authenticated:
        try:
            pedido = Pedido.objects.get(usuario=request.user, status="Carrinho")
        except Pedido.DoesNotExist:
            pedido = Pedido(usuario=request.user, status="Carrinho")
        
        if request.method == 'POST':
            id_produto = request.POST['produto']
            produto = Produto.objects.get(id=id_produto)
            quantidade = request.POST['quantidade']

            if quantidade == '':
                quantidade = 1
            elif  quantidade == '0' :
                quantidade = 1
            elif quantidade < str(0):
                quantidade = 1

            try:
                item = PedidoProduto.objects.get(pedido=pedido, produto=produto)
            except PedidoProduto.DoesNotExist:
                item = PedidoProduto(pedido=pedido, produto=produto, quantidade=0)
 
            item.quantidade = int(quantidade)
            pedido.save()
            item.save()
        
        dados = {
            'pedido': pedido,
            'itens': PedidoProduto.objects.filter(pedido=pedido)
        }
        
        return render(request, 'boleto/boletoBradesco.html', dados)
    
    messages.error(
                request, 'Desculpe! Mas você só pode inserir um produto ao carrinho se estiver logado.')
    return redirect('login')


def pagamento_cartao(request):
    """
    Função que sobre.
    Quando o usuário clicar no botão Sobre nós, rediciona para a página sobre.html
    """
    return render(request, 'boleto/pagamentoBoleto.html')


def carrinho(request):
    """
    Função do carrinho de compras.
    Verifica se o usuário esta logado no site.
    Se estiver é possível adicionar produtos ao seu carrinho e vê-los.
    Se não ele é redirecionado para a página de login
    """
    if request.user.is_authenticated:

        try:
            pedido = Pedido.objects.get(usuario=request.user, status="Carrinho")
        except Pedido.DoesNotExist:
            pedido = Pedido(usuario=request.user, status="Carrinho")
        
        if request.method == 'POST':
            id_produto = request.POST['produto']
            produto = Produto.objects.get(id=id_produto)
            quantidade = request.POST['quantidade']

            if quantidade == '':
                quantidade = 1
            elif  quantidade == '0' :
                quantidade = 1
            elif quantidade < str(0):
                quantidade = 1

            try:
                item = PedidoProduto.objects.get(pedido=pedido, produto=produto)
            except PedidoProduto.DoesNotExist:
                item = PedidoProduto(pedido=pedido, produto=produto, quantidade=0)
 
            item.quantidade = int(quantidade)
            pedido.save()
            item.save()
        
        dados = {
            'pedido': pedido,
            'itens': PedidoProduto.objects.filter(pedido=pedido)
        }
        
        return render(request, 'empresa/carrinho.html', dados)
    
    messages.error(
                request, 'Desculpe! Mas você só pode inserir um produto ao carrinho se estiver logado.')
    return redirect('login')



def remover_produto(request):
    """
    função de remover produto.
    função criada para remover um produto que esta adicionado ao carrinho de compras
    """
    if request.user.is_authenticated:

        if request.method == 'POST':
            id_item = request.POST['produto']

            try:
                item = PedidoProduto.objects.get(id=id_item)
                item.delete()
            except PedidoProduto.DoesNotExist:
                pass

        try:
            pedido = Pedido.objects.get(usuario=request.user, status="Carrinho")
        except Pedido.DoesNotExist:
            return render(request, 'empresa/carrinho.html')

        dados = {
            'pedido': pedido,
            'itens': PedidoProduto.objects.filter(pedido=pedido)
        }

        return render(request, 'empresa/carrinho.html', dados)
    
    messages.error(
                request, 'Desculpe! Mas não foi possível remover o produto.')
    return redirect('login')


def confirmar_compra(request):
    """
    função de confirmar compra.
    função criada para confirmar a compra e redirecionar os produtos para tela de confirmação
    """
    if request.user.is_authenticated:
       
        try:
            pedido = Pedido.objects.get(usuario=request.user, status="Carrinho")
        except Pedido.DoesNotExist:
            pedido = Pedido(usuario=request.user, status="Carrinho")
        
        if request.method == 'POST':
            id_produto = request.POST['produto']
            produto = Produto.objects.get(id=id_produto)
            quantidade = request.POST['quantidade']

            if quantidade == '':
                quantidade = 1

            try:
                item = PedidoProduto.objects.get(pedido=pedido, produto=produto)
            except PedidoProduto.DoesNotExist:
                item = PedidoProduto(pedido=pedido, produto=produto, quantidade=0)
 
            item.quantidade = int(quantidade)
            pedido.save()
            item.save()
        
        dados = {
            'pedido': pedido,
            'itens': PedidoProduto.objects.filter(pedido=pedido),
        }

        return render(request, 'empresa/confirmarCompra.html', dados)
    
    messages.error(
                request, 'Desculpe! Mas não foi confirmar sua compra.')
    return render(request, 'usuarios/login.html')


def remover_produto_confirmacao(request):
    """
    função de remover produto. da tela de confirmacao de  compra
    função criada para remover um produto da tela de confirmação de compra que esta adicionado ao carrinho de compras
    """
    if request.user.is_authenticated:

        if request.method == 'POST':
            id_item = request.POST['produto']

            try:
                item = PedidoProduto.objects.get(id=id_item)
                item.delete()
            except PedidoProduto.DoesNotExist:
                pass

        try:
            pedido = Pedido.objects.get(usuario=request.user, status="Carrinho")
        except Pedido.DoesNotExist:
            return render(request, 'empresa/carrinho.html')

        dados = {
            'pedido': pedido,
            'itens': PedidoProduto.objects.filter(pedido=pedido)
        }

        return render(request, 'empresa/confirmarCompra.html', dados)
    
    messages.error(
                request, 'Desculpe! Mas não foi possível remover o produto.')
    return redirect('login')


def politica_de_privacidade(request):
    """
    Função politica_de_privacidade.
    Quando o usuário clicar no link de politicas, 
    redireciona para a página de politicas de privacidade e termos de uso
    """
    return render(request, 'empresa/politicaDePrivacidade.html')


def politica_de_devolucao(request):
    """
    Função politica_de_devolucao.
    Quando o usuário clicar no link politica de devolucao, 
    redireciona para a página de politica troca, devolucao e arrependimentos
    """
    return render(request, 'empresa/politicaDeDevolucao.html')


def termos_de_compra(request):
    """
    Função termos_de_compra.
    Quando o usuário clicar no link politica de compra, 
    redireciona para a página de politica de compra e venda da loja
    """
    return render(request, 'empresa/termosDeCompra.html')


def politica_de_reembolso(request):
    """
    Função politica_de_reembolso.
    Quando o usuário clicar no link politica de reembolso, 
    redireciona para a página de politica de reembolso.
    """
    return render(request, 'empresa/politicaDeReembolso.html')

