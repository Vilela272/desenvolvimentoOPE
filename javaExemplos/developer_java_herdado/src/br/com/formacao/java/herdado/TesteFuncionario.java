package br.com.formacao.java.herdado;

/**
 * Classe que representa o teste do Funcion�rio que pode ser (Designer, Editor de v�deo e Gerente)
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TesteFuncionario {
	
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		nico.setNome("Guilherme");
		nico.setCpf("438.432.548-77");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		 
	}
}
