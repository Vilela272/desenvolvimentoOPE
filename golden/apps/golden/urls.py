from django.urls import path
from django.urls import path, include
from django.conf import settings
from django.conf.urls import url
from django.contrib import admin
from django.urls import path, include
from django.views.static import serve
from django.conf.urls.static import static

from . import views
from .models import Produto
from categorias.models import Categoria

urlpatterns = [
    path('<str:slug>/<int:categoria_id>/', views.produto, name='produto'),
    #path('<str:slug>/<int:produto_id>/', views.exibir_produto, name='exibirProdutro'),
    path('buscar', views.busca, name='buscar'),
    path('sobre/', views.sobre, name='sobre'),
    path('carrinho/', views.carrinho, name='carrinho'),
    path('removerProduto/', views.remover_produto, name="removerProduto"),
    path('removerProdutoConfirmarCompra/', views.remover_produto_confirmacao, name="removerProdutoConfirmarCompra"),
    path('confirmarCompra/', views.confirmar_compra, name="confirmarCompra"),
    path('politicaDePrivacidade/', views.politica_de_privacidade, name='politicaDePrivacidade'),
    path('politicaDeDevolucao/', views.politica_de_devolucao, name='politicaDeDevolucao'),
    path('termosDeCompra/', views.termos_de_compra, name='termosDeCompra'),
    path('politicaDeReembolso/', views.politica_de_reembolso, name='politicaDeReembolso'),
    path('boletoBradesco/', views.boleto_bradesco, name='boletoBradesco'),
    path('pagamentoCartao/', views.pagamento_cartao, name='pagamentoCartao'),

]  + static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)
