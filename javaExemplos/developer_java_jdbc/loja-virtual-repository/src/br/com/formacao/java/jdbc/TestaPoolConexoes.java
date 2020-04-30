package br.com.formacao.java.jdbc;

import java.sql.SQLException;

import br.com.formacao.java.jdbc.ConnectionFactory;;


public class TestaPoolConexoes {
	
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		for(int i = 0; i < 20;  i++) {
			connectionFactory.recuperarConexao();
			System.out.println("Conexao de número: " + i);
		}
	}

}
