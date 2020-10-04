# Generated by Django 3.1.1 on 2020-09-12 18:42

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('golden', '0003_auto_20200910_1845'),
    ]

    operations = [
        migrations.CreateModel(
            name='Categoria',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('imagem', models.ImageField(upload_to='media/images/noticias')),
                ('categoria', models.CharField(choices=[('Blusa de Moletom', 'Blusa de Moletom'), ('Calça de Sarja', 'Calça de Sarja'), ('Camisetas', 'Camisetas'), ('Bonés', 'Bonés'), ('Blusa corta-vento', 'Blusa corta-vento'), ('Calça de Moletom', 'Calça de Moletom'), ('Acessórios', 'Acessórios'), ('Jaquetas', 'Jaquetas'), ('Calçados', 'Calçados')], max_length=50, verbose_name='Status')),
            ],
        ),
    ]
