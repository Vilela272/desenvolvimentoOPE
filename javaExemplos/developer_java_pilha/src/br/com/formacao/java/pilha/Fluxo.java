package br.com.formacao.java.pilha;

/**
 * Classe que representa o Fluxo de execução da pilha.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class Fluxo {
	
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        }
        catch(Exception ex){
        	String msg = ex.getMessage();
        	System.out.println("Exception " + msg);
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }
        
    /**
     * 
     * @throws MinhaExcecao 
     */
    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    /**
     * 
     * @throws MinhaExcecao 
     */
    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao("Deu erro");
      
        //System.out.println("Fim do metodo2");
    }
}
