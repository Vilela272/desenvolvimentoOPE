from ajax_select import make_ajax_form
from ajax_select.admin import AjaxSelectAdmin
from django.contrib import admin
from .models import Produto, Pedido, PedidoProduto
from categorias.models import Categoria

class ListandoProdutos(admin.ModelAdmin):
    prepopulated_fields = {"slug": ('nome_produto', )}
    list_display = ('id', 'nome_produto', 'data_produto','publicada', 'preco', 'categoria',)
    list_display_links = ('id',  'nome_produto', )
    search_fields = ('nome_produto', )
    list_filter = ('categoria', 'publicada', )
    list_editable = ('publicada', 'preco', )
    list_per_page = 4

class ListandoPedidos(admin.ModelAdmin):
    list_display = ('id', 'usuario', 'status', 'data_pedido')
    list_display_links = ('id', )
    list_filter = ('usuario', 'status', )
    list_editable = ('status', )
    list_per_page = 4

class ListandoPedidosProdutos(admin.ModelAdmin):
    list_display = ('usuario', 'produto', 'quantidade', 'pedido')
    list_display_links = ('usuario', )
    list_filter = ('usuario',)
    list_editable = ('pedido', )
    list_per_page = 5


admin.site.register(Produto, ListandoProdutos)
admin.site.register(Pedido, ListandoPedidos)
admin.site.register(PedidoProduto, ListandoPedidosProdutos)
