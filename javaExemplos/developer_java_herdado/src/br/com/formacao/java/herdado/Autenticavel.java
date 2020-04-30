package br.com.formacao.java.herdado;

/**
 * Classe que representa a Autentica��o da senha
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public abstract interface Autenticavel {
		
	/**
	 * 
	 * @param senha
	 */
		public abstract void setSenha(int senha);
		
	/**
	 * 
	 * @param senha
	 * @return
	 */
		public abstract boolean autentica(int senha);
		
}