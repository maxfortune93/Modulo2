package com.Exercico1.Exercico1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Exercico1")
public class Exercico1Controller {

	@GetMapping
	
	public String Exercicio1() {
		return "Nessa atividade usei a persistencia e atençao aos detalhos";
		
	}
}
