package br.com.formacao.java.Modelo;

/**
 * Classe que representa o Calculador de Imposto
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */

//br.com.bytebank.banco.Modelo.CalculadorDeImposto => FQN
public class CalculadorDeImposto  {
	
	private double totalImposto;
	
	/**
	 * Registra o imposto
	 * 
	 * @param t
	 */
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	/**
	 * Retorna o total do imposto
	 * 
	 * @return
	 */
	public double getTotalImposto() {
		return totalImposto;
	}
}