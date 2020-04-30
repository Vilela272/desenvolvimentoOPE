package br.com.formacao.java.gerenciador.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.formacao.java.gerenciador.modelo.Banco;
import br.com.formacao.java.gerenciador.modelo.Empresa;

/**
 * Classe que representa a acao de mostrar as empresas
 * 
 * @author Guilherme Vilela
 * @version 1.0.0
 *
 */
public class MostraEmpresa implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("mostrando dados da empresa");

		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Banco banco = new Banco();

		Empresa empresa = banco.buscaEmpresaPelaId(id);

		System.out.println(empresa.getNome());

		request.setAttribute("empresa", empresa);

		return "forward:formAlteraEmpresa.jsp";
	}

}
