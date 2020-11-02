from ajax_select import make_ajax_form
from ajax_select.admin import AjaxSelectAdmin
from django.contrib import admin
from .models import Produto, Pedido, PedidoProduto
from categorias.models import Categoria

class ListandoProdutos(admin.ModelAdmin):
    prepopulated_fields = {"slug": ('nome_produto', )}
    list_display = ('id', 'nome_produto', 'data_produto','publicada', 'categoria', 'categoria_id')
    list_display_links = ('id',  'nome_produto', )
    search_fields = ('nome_produto', )
    list_filter = ('categoria', 'publicada', )
    list_editable = ('publicada', )
    list_per_page = 4

class ListandoPedidos(admin.ModelAdmin):
    list_display = ('id', 'usuario', 'status', 'data_pedido')
    list_display_links = ('id', 'data_pedido', )
    list_editable = ('status', )
    list_filter = ('usuario', 'status', )
    list_per_page = 4

class ListandoPedidosProdutos(admin.ModelAdmin):
    list_display = ('id', 'pedido', 'produto', 'quantidade')
    list_display_links = ('id', 'produto', 'pedido' )
    list_filter = ('pedido',)
    list_per_page = 20


admin.site.register(Produto, ListandoProdutos)
admin.site.register(Pedido, ListandoPedidos)
admin.site.register(PedidoProduto, ListandoPedidosProdutos)
