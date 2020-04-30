package br.com.caelum.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Classe que representa o controller da Home
 * 
 * @author Guilherme Vilela
 * @version 1.0.0
 *
 */

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() throws SQLException {
		return "home";
	}

}
