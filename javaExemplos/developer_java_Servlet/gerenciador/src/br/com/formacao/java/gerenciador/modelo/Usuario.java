package br.com.formacao.java.gerenciador.modelo;

/**
 * Classe que representa um usuario
 * 
 * @author Guilherme Vilela
 * @version 1.0.0
 *
 */
public class Usuario {

	private String login;
	private String senha;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean ehIgual(String login, String senha) {
		if (!this.login.equals(login)) {
			return false;
		}

		if (!this.senha.equals(senha)) {
			return false;
		}

		return true;
	}
}