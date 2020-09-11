from django.db import models
from datetime import datetime

class Product(models.Model):
    nome_produto = models.CharField(max_length=200)
    descricao = models.TextField()
    design_produto = models.TextField()
    categoria = models.CharField(max_length=100)
    data_produto = models.DateTimeField(default=datetime.now, blank=True)
    tamanho_pequeno = models.CharField(max_length=100)
    tamanho_medio = models.CharField(max_length=100)
    tamanho_grande = models.CharField(max_length=100)
    tamanho_gigante = models.CharField(max_length=100)
    cor_preto = models.CharField(max_length=100)
    cor_azul = models.CharField(max_length=100)
    cor_branco = models.CharField(max_length=100)
    cor_cinza = models.CharField(max_length=100)
