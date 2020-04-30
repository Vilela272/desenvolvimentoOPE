package br.com.formacao.java.composto;

/**
 * Classe que representa o teste de uma conta sem ter o cliente.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaContaSemCliente {
	
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
	}
}