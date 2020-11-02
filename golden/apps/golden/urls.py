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
    path('confirmarCompra/', views.confirmar_compra, name="confirmarCompra")
]  + static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)
