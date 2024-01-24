package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm-generation")
public class BsmGeneration {
		
	@GetMapping
	public String bsmGeneration() {
		return "Comportamentos e Mentalidades, Mentalidade de Crecimento, Persistencia, Responsabilidade Pessoal, Orientação ao Futuro, Comunicação, Orientação ao Detalhe, Proatividade e Trabalho em Equipe";
	}

}
