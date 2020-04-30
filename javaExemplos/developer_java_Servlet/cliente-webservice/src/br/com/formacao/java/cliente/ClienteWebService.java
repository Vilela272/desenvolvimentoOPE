package br.com.formacao.java.cliente;

import java.io.IOException;

import org.apache.http.client.fluent.Request;

/**
 * Classe que representa o Web Service
 * 
 * @author Guilherme Vilela
 * @version 1.0.0
 *
 */
public class ClienteWebService {

	public static void main(String[] args) throws IOException {

		String conteudo = Request
				.Post("http://localhost:8080/gerenciador/empresas")
				.addHeader("Accept", "application/xml")
				.execute()
				.returnContent()
				.asString();

		System.out.println(conteudo);
	}

}
