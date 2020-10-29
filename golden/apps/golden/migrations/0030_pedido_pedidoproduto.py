# Generated by Django 3.1.2 on 2020-10-24 00:41

import datetime
from django.conf import settings
from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        migrations.swappable_dependency(settings.AUTH_USER_MODEL),
        ('golden', '0029_auto_20201009_1043'),
    ]

    operations = [
        migrations.CreateModel(
            name='Pedido',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('status', models.CharField(choices=[('Carrinho', 'Carrinho'), ('Finalizado', 'Finalizado'), ('Pago', 'Pago'), ('Aguardando Pagamento', 'Aguardando Pagamento')], max_length=50, unique=True, verbose_name='Status')),
                ('data_pedido', models.DateTimeField(blank=True, default=datetime.datetime.now)),
                ('usuario', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to=settings.AUTH_USER_MODEL)),
            ],
            options={
                'verbose_name_plural': 'Pedidos',
            },
        ),
        migrations.CreateModel(
            name='PedidoProduto',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('quantidade', models.IntegerField()),
                ('pedido', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='golden.pedido')),
                ('produto', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='golden.produto')),
            ],
            options={
                'verbose_name_plural': 'Pedido produtos',
            },
        ),
    ]
