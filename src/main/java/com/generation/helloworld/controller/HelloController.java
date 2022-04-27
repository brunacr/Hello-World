package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
		public String bsm() {
		return "Comunicação <br/> Persistência <br/> Mentalidade de Crescimento <br/> Comunicação <br/> Responsabilidae Pessoal <br/> Orientação ao Futuro <br/> Orientação ao Detalhe <br/> Proatividade <br/> Trabalho em Equipe";
	}
	
	@GetMapping("/objetivos")
		public String objetivos() {
		return "Aprender mais sobre BD e sobre Spring";
	}
}
