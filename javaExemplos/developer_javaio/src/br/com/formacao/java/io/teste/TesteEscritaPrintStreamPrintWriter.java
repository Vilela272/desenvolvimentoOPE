package br.com.formacao.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;


/**
 * Classe que representa a escrita de um arquivo Utilizando o FileWriter e PrintStream.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TesteEscritaPrintStreamPrintWriter {

	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		//Fluxo de Entrada com Arquivo
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
//		PrintStream ps = new PrintStream(new File("lorem.txt"));
		
		PrintWriter ps = new PrintWriter("lorem2.txt");
//		PrintStream ps = new PrintStream("lorem2.txt");
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		
        ps.println("cupidatat non proident, sunt in culpa qui officia deserunt mollit anim");
        
        ps.close();
	}
}
