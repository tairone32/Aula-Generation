package com.blog.blogpessoal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.blogpessoal.model.Postagem;
import com.blog.blogpessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/Postagem")
@CrossOrigin(value = "*",allowedHeaders = "*")
public class PostagemController {

	@Autowired
	private PostagemRepository repository;
	
	@PutMapping
	public ResponseEntity<Postagem> getatualize(@RequestBody Postagem Atualizacao){
		return null;
	}
	
	
}
