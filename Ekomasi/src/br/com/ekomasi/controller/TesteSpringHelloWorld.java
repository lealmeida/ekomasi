package br.com.ekomasi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TesteSpringHelloWorld {
	
	@RequestMapping("/helloWorldSpring")
	public String execute() {
		System.out.println("Executando Spring MVC");
		return "ok";
	}

}
