package com.helloworld.app.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication {
	
	@GetMapping("/atividade1")
	public ResponseEntity<String> atividade1() {
		return ResponseEntity.status(200).body("Habilidades: Orientação ao detalhe; Mentalidades: Mentalidade de crescimento e persistência");
	}
	
	@GetMapping("/atividade2")
	public ResponseEntity<String> atividade2() {
		return ResponseEntity.status(200).body("Objetivos de aprendizagem: Aprender como utlizar essa nova ferramenta e desenvolver novos conhecimentos");
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}