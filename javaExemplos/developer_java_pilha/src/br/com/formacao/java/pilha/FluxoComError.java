package br.com.formacao.java.pilha;

/**
 * Classe que representa o Fluxo de execução com Error
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class FluxoComError {
	
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        }
        catch(ArithmeticException | NullPointerException ex){
        	String msg = ex.getMessage();
        	System.out.println("Exception " + msg);
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    
    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    
    private static void metodo2() {
       System.out.println("Chamando o m�todo 2");
       metodo2();
       System.out.println("Fiim do m�todo 2");
    }
}
