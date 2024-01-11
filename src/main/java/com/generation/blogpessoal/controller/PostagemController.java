package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*") // Informa que toda e qualquer origem pode acessar essa rota
public class PostagemController {
	
	// Injeção de dependências
	@Autowired
	private PostagemRepository postagemRepository;
	
	// Acessado pelo verbo GET
	@GetMapping
	public ResponseEntity<List<Postagem>> getAll() {
		// Respostas no formato http
		
		return ResponseEntity.ok(postagemRepository.findAll());
		// find all == select * from nomedatabela
		// Código de retorno -- Corpo de retorno
	}
	
	@GetMapping("/exemplo")
	public ResponseEntity<String> exemplo() {
		String ola = "Hello World";
		return ResponseEntity.noContent().build(); 
	}

}
