package br.com.formacao.java.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Classe que representa o login no formulário
 * 
 * @author Guilherme Vilela
 * @version 1.0.0
 *
 */
public class LoginForm implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		return "forward:formLogin.jsp";
	}
}
