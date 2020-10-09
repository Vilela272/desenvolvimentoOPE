from django.db import models

# Create your models here.
class Categoria(models.Model):
    nome_categoria = models.CharField('Categoria', max_length=50, unique=True, blank=False, null=False, choices=(
        ('Blusa de Moletom', 'Blusa de Moletom'),
        ('Calça de Sarja', 'Calça de Sarja'),
        ('Camisetas', 'Camisetas'),
        ('Bonés', 'Bonés'),
        ('Blusa corta-vento', 'Blusa corta-vento'),
        ('Calça de Moletom', 'Calça de Moletom'),
        ('Acessórios', 'Acessórios'),
        ('Jaquetas', 'Jaquetas'),
        ('Calçados', 'Calçados'),
    ))
    sub_categoria = models.ForeignKey('Categoria', null=True, blank=True, related_name='cat_child', on_delete=models.CASCADE)
    slug = models.SlugField(unique=True)
    foto_categoria = models.ImageField(upload_to='fotos/categorias/%d/%m/%Y/', blank=True)
    publicada = models.BooleanField(default=False)

    class Meta:
        verbose_name_plural = 'Categorias'

    def __str__(self):
        return self.nome_categoria
