package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@GetMapping("/1")
	public String helloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("/2")
	public String bsm() {
		return "Mentalidade de Crescimento | Orientação ao Futuro | "
				+ "Responsabilidade Pessoal | Persistência | Trabalho em Equipe "
				+ "| Comunicação | Proatividade | Orientação ao Detalhe";
	}
	
	@GetMapping("/3")
	public String objetivos(){
		return "API | Integração Banco de dados";
	}
}
