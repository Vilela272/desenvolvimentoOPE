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


class Pedido(models.Model):
    usuario = models.ForeignKey(User, on_delete=models.CASCADE)
    status = models.CharField('Status', max_length=50, blank=False, null=False, 
    choices=(
        ('Carrinho', 'Carrinho'),
        ('Finalizado', 'Finalizado'),
        ('Pago', 'Pago'),
        ('Aguardando Pagamento', 'Aguardando Pagamento'),
    ))
    data_pedido = models.DateTimeField(default=datetime.now, blank=True)

    class Meta:
        verbose_name_plural = 'Pedidos'
    
    def __str__(self):
        return "Situação do pedido: " + self.status 


class PedidoProduto(models.Model):
    pedido = models.ForeignKey(Pedido, on_delete=models.CASCADE)
    produto = models.ForeignKey(Produto, on_delete=models.CASCADE)
    quantidade = models.IntegerField()

    class Meta:
        verbose_name_plural = 'Pedido produtos'
    
    def __str__(self):
        return "Pedido Produtos" 