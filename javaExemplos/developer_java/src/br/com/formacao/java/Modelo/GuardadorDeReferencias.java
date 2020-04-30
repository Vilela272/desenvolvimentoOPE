package br.com.formacao.java.Modelo;

/**
 * Classe que representa o Guardador de contas.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */

public class GuardadorDeReferencias {
	
	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}
	
	/**
	 * 
	 * @param ref
	 */
	public void adicionar(Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}
	
	/**
	 * 
	 * @param pos
	 * @return
	 */
	public Object geReferencia(int pos) {
		return this.referencias[pos];
	}

}
