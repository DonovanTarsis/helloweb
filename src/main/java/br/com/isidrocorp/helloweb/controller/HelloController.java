package br.com.isidrocorp.helloweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/teste")
	public String digaOla(){
		return "Vamo botar o DevTools pra trabalhar";
	}

}
