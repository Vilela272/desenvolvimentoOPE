package br.com.formacao.java.Inicio;

/**
 * Classe que representa a criacao de uma conta.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class CriaConta {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
	}
}
