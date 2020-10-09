from django.db import models
from datetime import datetime
from categorias.models import Categoria
from django.contrib.auth.models import User


class Produto(models.Model):
    categoria = models.ForeignKey(Categoria, on_delete=models.CASCADE)
    nome_produto = models.CharField(max_length=200, unique=True)
    slug = models.SlugField(unique=True)
    descricao = models.TextField(max_length=255)
    design_produto = models.TextField(max_length=255)
    data_produto = models.DateTimeField(default=datetime.now, blank=True)
    quantidade = models.IntegerField(default=1)
    preco = models.DecimalField(max_digits=8, decimal_places=2)
    foto_produto = models.ImageField(upload_to='fotos/%d/%m/%Y/', blank=True)
    publicada = models.BooleanField(default=False)

    class Meta:
        verbose_name_plural = 'Produtos'

    def __str__(self):
        return self.nome_produto
