package br.com.formacao.java.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.formacao.java.gerenciador.modelo.Banco;
import br.com.formacao.java.gerenciador.modelo.Empresa;

/**
 * Classe que representa a listagem de empresas
 * 
 * @author Guilherme Vilela
 * @version 1.0.0
 *
 */
public class ListaEmpresas implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		long antes = System.currentTimeMillis();
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		request.setAttribute("empresas", lista);
		
		long depois = System.currentTimeMillis();
		
		System.out.println("O tempo de execucao: " + (depois - antes));
		
		return "forward:listaEmpresas.jsp";
	}
}
