package br.com.formacao.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Classe que representa a escrita de um arquivo
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TesteEscritaFileWriter {

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
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.write("cupidatat non proident, sunt in culpa qui officia deserunt mollit anim");
        
        bw.close();
	}
}
