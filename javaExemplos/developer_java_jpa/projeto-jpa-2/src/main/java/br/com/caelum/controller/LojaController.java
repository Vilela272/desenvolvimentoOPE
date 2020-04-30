package br.com.caelum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Classe que representa o controller da Loja
 * 
 * @author Guilherme Vilela
 * @version 1.0.0
 *
 */

@Controller
@RequestMapping("/loja")
public class LojaController {
	
	@RequestMapping("/form")
	public String form() { 
		return "loja/form";
	}
}
