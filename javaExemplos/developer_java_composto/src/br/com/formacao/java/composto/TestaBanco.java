package br.com.formacao.java.composto;

/**
 * Classe que representa o teste de um banco
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaBanco {
	
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		
		Cliente guilherme = new Cliente();
		guilherme.nome = "Guilherme Vilela";
		guilherme.cpf = "222.222.222-22";
		guilherme.profissao = "Estagi�rop em An�lise de Sistemas";
		
		Conta contaDoGuilherme = new Conta();
		contaDoGuilherme.titular = guilherme;
		
		System.out.println(contaDoGuilherme.titular.nome);
		System.out.println(contaDoGuilherme.titular);
		System.out.println(guilherme);
	}

}
