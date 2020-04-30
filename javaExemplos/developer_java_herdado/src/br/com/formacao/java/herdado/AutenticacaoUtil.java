package br.com.formacao.java.herdado;

/**
 * Classe que representa a Autentica��o �til da conta
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class AutenticacaoUtil{
	
	private int senha;
	
	/**
	 * 
	 * @param senha
	 */
	
	public void setSenha(int senha) {
	this.senha = senha;
	
	}
	
	/**
	 * 
	 * @param senha
	 * @return True || False
	 */
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}

}