# Generated by Django 3.1.2 on 2020-10-28 01:04

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('golden', '0033_pedidoproduto_usuario'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='pedidoproduto',
            name='usuario',
        ),
    ]
