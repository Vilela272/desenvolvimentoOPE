from django.shortcuts import render, get_list_or_404, get_object_or_404
from .models import Categorias

# Create your views here.
def index(request):

    categorias = Categorias.objects.order_by('nome_categoria').filter(publicada=True)

    dados = {
        'categorias' : categorias
    }
    return render(request, 'index.html',  dados)

def categoria(request, categoria_id):

    categoria = get_object_or_404(Categorias, pk=categoria_id)

    categoria_a_exibir = {
        'categoria': categoria
    }
    return render(request, 'index.html', categoria_a_exibir)
