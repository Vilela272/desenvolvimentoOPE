from django import forms
from django.contrib.auth.models import User
from .models import UserProfile


class UserForm(forms.ModelForm):
    class Meta:
        model = User
        fields = ('first_name', 'last_name')

        widgets = {
            'first_name': forms.TextInput(attrs={'class': 'form-control border border-dark rounded text-dark'}),
            'last_name': forms.TextInput(attrs={'class': 'form-control border border-dark rounded text-dark'}),
        }

        labels = {
            'first_name': "Nome",
            'last_name': "Sobrenome",
        }


class UserProfileForm(forms.ModelForm):
    class Meta:
        model = UserProfile
        exclude = ('user', 'remote_customer_id')

        widgets = {
            'cpf': forms.TextInput(attrs={'class': 'form-control border border-dark rounded text-dark'}),
            'address': forms.TextInput(attrs={'class': 'form-control border border-dark rounded text-dark'}),
            'number': forms.TextInput(attrs={'class': 'form-control border border-dark rounded text-dark'}),
            'address2': forms.TextInput(attrs={'class': 'form-control border border-dark rounded text-dark'}),
            'city': forms.TextInput(attrs={'class': 'form-control border border-dark rounded text-dark'}),
            'district': forms.TextInput(attrs={'class': 'form-control border border-dark rounded text-dark'}),
            'state': forms.TextInput(attrs={'class': 'form-control border border-dark rounded text-dark'}),
            'country': forms.TextInput(attrs={'class': 'form-control border border-dark rounded text-dark'}),
            'zipcode': forms.TextInput(attrs={'class': 'form-control border border-dark rounded text-dark'}),
            'phone': forms.TextInput(attrs={'class': 'form-control border border-dark rounded text-dark'}),
        }

        labels = {
            'cpf': "CPF",
            'address': "Endereço",
            'number': "Número",
            'address2': "Complemento",
            'city': "Cidade",
            'district': "Bairro",
            'state': "Estado",
            'country': "País",
            'zipcode': "CEP",
            'phone': "Telefone ou Celular com DDD",
        }
