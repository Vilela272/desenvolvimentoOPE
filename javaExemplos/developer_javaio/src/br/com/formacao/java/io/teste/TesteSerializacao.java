package br.com.formacao.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * classe que representa o teste de serializa��o de um fluxo bin�rio
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		String nome = "Nico Steppat";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String)ois.readObject();
		ois.close();
		
		System.out.println(nome);
	}

}
