from django.urls import path
from django.urls import path, include
from django.conf import settings
from django.conf.urls import url
from django.contrib import admin
from django.urls import path, include
from django.views.static import serve
from django.conf.urls.static import static

from . import views

urlpatterns = [
    path('', views.index, name='index'),
    path('<int:produto_id>/', views.produto, name="produto"),
    path('buscar', views.buscar, name='buscar'),
    path('sobre/', views.sobre, name='sobre'),
    path('carrinho/', views.carrinho, name='carrinho'),
    path('pagamento/', views.pagamento, name='pagamento'),
    path('acompanhamento/', views.acompanhamento, name='acompanhamento')
]  + static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)
