package br.com.formacao.java.Testes;

import br.com.formacao.java.Modelo.ContaCorrente;
import br.com.formacao.java.Modelo.CalculadorDeImposto;
import br.com.formacao.java.Modelo.SeguroDeVida;

/**
 * Classe que representa o teste dos tributos de imposto.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */

public class TesteTributaveis {
	
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111,222);	
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}
}
