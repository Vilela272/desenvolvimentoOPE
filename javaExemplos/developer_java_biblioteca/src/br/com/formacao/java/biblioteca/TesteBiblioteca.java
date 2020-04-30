package br.com.formacao.java.biblioteca;

import br.com.formacao.java.Modelo.Conta;
import br.com.formacao.java.Modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123, 321);
		c.deposita(200.3);
		
		System.out.println(c.getSaldo());

	}

}
