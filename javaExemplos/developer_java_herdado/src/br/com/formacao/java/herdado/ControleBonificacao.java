package br.com.formacao.java.herdado;

/**
 * Classe que representa o controle de bonifica��o do funcion�rio.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class ControleBonificacao {
	
	private double soma;
	
	/**
	 * 
	 * @param f
	 */
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma += boni;
	}
	
	/**
	 * 
	 * @return Soma
	 */
	public double getSoma() {
		return soma;
	}

}
