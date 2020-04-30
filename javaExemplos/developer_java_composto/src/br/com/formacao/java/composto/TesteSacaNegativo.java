package br.com.formacao.java.composto;

/**
 * Classe que representa o teste de Saque com saldo negativo
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TesteSacaNegativo {
	
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101));
		
		conta.saca(101);
		
		System.out.println(conta.getSaldo());
	}
}