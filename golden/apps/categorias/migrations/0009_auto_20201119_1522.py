# Generated by Django 3.1.2 on 2020-11-19 18:22

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('categorias', '0008_auto_20201009_1109'),
    ]

    operations = [
        migrations.AlterField(
            model_name='categoria',
            name='publicada',
            field=models.BooleanField(default=True),
        ),
    ]
