from ajax_select import register, LookupChannel
from django.contrib.auth.models import User
from .models import Categoria


@register('categorias')
class CategoriaLookup(LookupChannel):
    model = Categoria

    def get_query(self, q, request):
        return self.model.objects.filter(nome_categoria__icontains=q).order_by('nome_categoria')
