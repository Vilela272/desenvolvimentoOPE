package br.com.formacao.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Classe que representa o teste de caracteres do tipo Encondig e charsets.
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TesteUnicodeEEncoding {

	/**
	 * 
	 * @param args
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {

		String s = "�";
		System.out.println(s.codePointAt(0));//unicode
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		String snovo = new String(bytes, "windows-1252");
		System.out.println(snovo);
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		snovo = new String(bytes, "UTF-16");
		System.out.println(snovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US-ASCII, ");
		snovo = new String(bytes, "US-ASCII");
		System.out.println(snovo);
	}

}
