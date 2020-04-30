package br.com.formacao.java.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.formacao.java.gerenciador.modelo.Banco;
import br.com.formacao.java.gerenciador.modelo.Usuario;

/**
 * Classe que representa o Login
 * 
 * @author Guilherme Vilela
 * @version 1.0.0
 *
 */
public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		System.out.println("Usuário: " + login);
		
		Banco banco = new Banco();
		Usuario usuario = banco.existeUsuario(login, senha);
		
		if(usuario != null) {
			System.out.println("Usuário: " + login + " existe");
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuariologado", usuario);
			return "redirect:entrada?acao=ListaEmpresas";
		}else {
			System.out.println("Este usuário não existe");
			return "redirect:entrada?acao=LoginForm";
		}
	}
}