package br.com.formacao.java.Testes;

import br.com.formacao.java.Modelo.GuardadorDeContas;
import br.com.formacao.java.Modelo.ContaCorrente;
import br.com.formacao.java.Modelo.Conta;

/**
 * Classe que representa todos os testes.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */

public class TesteGuardadorDeContas {
	
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adicionar(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		guardador.adicionar(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.geReferencia(1);
		System.out.println(ref.getNumero());
	}

}
