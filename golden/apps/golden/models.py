from django.db import models
from datetime import datetime
from categorias.models import Categoria
from django.contrib.auth.models import User


class Produto(models.Model):
    categoria = models.ForeignKey(Categoria, on_delete=models.CASCADE)
    nome_produto = models.CharField(max_length=200)
    slug = models.SlugField(unique=True)
    descricao = models.TextField()
    design_produto = models.TextField()
    data_produto = models.DateTimeField(default=datetime.now, blank=True)
    quantidade = models.IntegerField(default=1)
    preco = models.DecimalField(max_digits=8, decimal_places=2)
    tamanho_um = models.CharField('Tamanhos', max_length=5, blank=True, null=False, default='P')
    tamanho_dois = models.CharField('Tamanhos', max_length=5, blank=True, null=False, default='M')
    tamanho_tres = models.CharField('Tamanhos', max_length=5, blank=True, null=False, default='G')
    tamanho_quatro = models.CharField('Tamanhos', max_length=5, blank=True, null=False, default='GG')
    foto_produto = models.ImageField(upload_to='fotos/%d/%m/%Y/', blank=True)
    publicada = models.BooleanField(default=False)

    class Meta:
        verbose_name_plural = 'Produtos'

    def __str__(self):
        return self.nome_produto
