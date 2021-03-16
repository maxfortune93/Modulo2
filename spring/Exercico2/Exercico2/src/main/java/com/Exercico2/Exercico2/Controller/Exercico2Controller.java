package com.Exercico2.Exercico2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Exercico2")
public class Exercico2Controller {
	
	@GetMapping
	
	public String Exercico2() {
		return "Meu objetivo dessa semana é aprimorar o spring e as ferramentas ensinadas anteriormente";
	}
	

}
