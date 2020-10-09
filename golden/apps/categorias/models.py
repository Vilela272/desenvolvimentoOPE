from django.db import models

# Create your models here.
class Categoria(models.Model):
    nome_categoria = models.CharField('Categoria', max_length=50, unique=True, blank=False, null=False, 
    choices=(
        ('Acessórios', 'Acessórios'),
        ('Blusas', 'Blusas'),
        ('Bonés', 'Bonés'),
        ('Calças', 'Calças'),
        ('Camisetas', 'Camisetas'),
        ('Jaquetas', 'Jaquetas'),
    ))
    slug = models.SlugField(unique=True)
    foto_categoria = models.ImageField(upload_to='fotos/categorias/%d/%m/%Y/', blank=True)
    publicada = models.BooleanField(default=False)

    class Meta:
        verbose_name_plural = 'Categorias'

    def __str__(self):
        return self.nome_categoria
