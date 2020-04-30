package br.com.formacao.java.herdado;

/**
 * Classe que representa um Editor de V�deo que extende de funcion�rio.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class EditorDeVideo extends Funcionario {
		
    /**
     * 
     * @return 150
     */
        public double getBonificacao() {
            System.out.println("chamando a bonifica��o do Editor de V�deo");
            return 150;
	}
}
