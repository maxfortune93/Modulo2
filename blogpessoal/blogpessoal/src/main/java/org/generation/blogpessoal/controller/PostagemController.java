package org.generation.blogpessoal.controller;

import java.util.List;

import org.generation.blogpessoal.model.postagem;
import org.generation.blogpessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagem")
@CrossOrigin("*")
public class PostagemController {
	@Autowired
	private PostagemRepository repository;

	@GetMapping
	public ResponseEntity<List<postagem>> GetAll(){
	return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<postagem> GetById(@PathVariable long id){
	return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/titulo{titulo}")
	public ResponseEntity<List<postagem>> GetByTitulo(@PathVariable String titulo){
	return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));

	}

}
