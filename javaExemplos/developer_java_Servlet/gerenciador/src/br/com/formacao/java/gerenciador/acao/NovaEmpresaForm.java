package br.com.formacao.java.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.formacao.java.gerenciador.modelo.Banco;
import br.com.formacao.java.gerenciador.modelo.Empresa;

/**
 * Classe que representa a criacao de novas empresas no formulario
 * 
 * @author Guilherme Vilela
 * @version 1.0.0
 *
 */
public class NovaEmpresaForm implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		return "forward:formNovaEmpresa.jsp";
	}
}