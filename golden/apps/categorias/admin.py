from ajax_select import make_ajax_form
from ajax_select.admin import AjaxSelectAdmin

from django.contrib import admin
from .models import Categoria

# Register your models here.
class ListandoCategorias(AjaxSelectAdmin):
    prepopulated_fields = {"slug": ('nome_categoria', )}
    list_display = ('id', 'nome_categoria','slug', 'foto_categoria', 'publicada')
    list_display_links = ('id',  'nome_categoria' )
    search_fields = ('id', 'nome_categoria', )
    list_filter = ('nome_categoria', 'publicada',  )
    list_editable = ('publicada', )
    list_per_page = 3

admin.site.register(Categoria, ListandoCategorias)
