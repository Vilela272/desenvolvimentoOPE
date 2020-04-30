package br.com.formacao.java.Modelo;

/**
 * Classe que representa o Guardador de contas.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	/**
	 * 
	 * @param ref
	 */
	public void adicionar(Conta ref) {
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
	public Conta geReferencia(int pos) {
		return this.referencias[pos];
	}

}
