package br.com.formacao.java.herdado;

/**
 * Classe que representa a autentica��o de um cliente.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class Cliente implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
		
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}