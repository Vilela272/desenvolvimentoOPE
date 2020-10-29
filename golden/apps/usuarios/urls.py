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
    path('cadastro', views.cadastro, name='cadastro'),
    path('meus_dados', views.meus_dados, name='meus_dados'),
    path('login', views.login, name='login'),
    path('logout', views.logout, name='logout')
]
