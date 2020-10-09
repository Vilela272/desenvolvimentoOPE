from django.contrib import admin
from django.urls import path, include
from django.conf import settings
from django.conf.urls.static import static
from ajax_select import urls as ajax_select_urls

urlpatterns = [
    path('ajax_select/', include(ajax_select_urls)),
    path('', include('usuarios.urls')),
    path('', include('golden.urls')),
    path('', include('categorias.urls')),
    path('usuarios/', include('usuarios.urls')),
    path('admin/', admin.site.urls),
] + static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)
