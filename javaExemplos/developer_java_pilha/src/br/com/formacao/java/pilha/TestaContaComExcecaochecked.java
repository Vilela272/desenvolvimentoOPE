package br.com.formacao.java.pilha;

/**
 * Classe que representa o teste de conta com a Exceção checked
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaContaComExcecaochecked {
	
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
			c.deposita();	
		} 
		catch (MinhaExcecao ex) {
			System.out.println("tratamento.......");
		}
	}

}
