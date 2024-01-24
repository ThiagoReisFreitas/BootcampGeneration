package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-aprendizagem-semana")
public class ObjetivosAprendizagemSemana {

	@GetMapping
	public String objetivosAprendizagemSemana() {
		return "Fixar Banco de dados e Aprender Spring";
	}
}
