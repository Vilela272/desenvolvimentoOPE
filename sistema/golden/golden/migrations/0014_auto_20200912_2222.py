# Generated by Django 3.1.1 on 2020-09-13 01:22

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('golden', '0013_auto_20200912_2218'),
    ]

    operations = [
        migrations.AlterField(
            model_name='product',
            name='tamanho_dois',
            field=models.CharField(default='M', max_length=5, unique=True, verbose_name='Tamanhos'),
        ),
        migrations.AlterField(
            model_name='product',
            name='tamanho_quatro',
            field=models.CharField(default='GG', max_length=5, unique=True, verbose_name='Tamanhos'),
        ),
        migrations.AlterField(
            model_name='product',
            name='tamanho_tres',
            field=models.CharField(default='G', max_length=5, unique=True, verbose_name='Tamanhos'),
        ),
        migrations.AlterField(
            model_name='product',
            name='tamanho_um',
            field=models.CharField(default='P', max_length=5, unique=True, verbose_name='Tamanhos'),
        ),
    ]
