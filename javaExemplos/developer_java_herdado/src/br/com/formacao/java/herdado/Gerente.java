package br.com.formacao.java.herdado;

/**
 * Classe que representa um Gerente que extende de Funcion�rio e assina um contrato de autentica��o
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class Gerente extends Funcionario implements Autenticavel{
	
private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
        /**
         * 
         * @return Salario
         */
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do Gerente");
		return super.getSalario();
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
