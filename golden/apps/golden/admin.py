from ajax_select import make_ajax_form
from ajax_select.admin import AjaxSelectAdmin
from django.contrib import admin
from .models import Produto

class ListandoProdutos(admin.ModelAdmin):
    prepopulated_fields = {"slug": ('nome_produto', )}
    list_display = ('id', 'nome_produto', 'categoria', 'data_produto','publicada')
    list_display_links = ('id',  'nome_produto', )
    search_fields = ('nome_produto', )
    list_filter = ('categoria', 'publicada', )
    list_editable = ('publicada', )
    list_per_page = 5

admin.site.register(Produto, ListandoProdutos)
