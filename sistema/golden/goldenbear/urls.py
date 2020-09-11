from django.contrib import admin
from django.urls import path, include

urlpatterns = [
    path('', include('golden.urls')),
    path('admin/', admin.site.urls),
]
