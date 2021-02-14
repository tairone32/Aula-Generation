package com.segundoblogpessoal.blognoticias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.segundoblogpessoal.blognoticias.model.Postagem;
import com.segundoblogpessoal.blognoticias.repository.PostagemRepository;

@RestController /*informa para o Spring que essa classe se trata de um controlador*/
@RequestMapping("/postagens") /*define qual a rota/RL que essa classe sera acessada*/
@CrossOrigin("*") /*define que essa classe aceite requisição de qualquer origem*/
public class PostagemController {
	
	@Autowired /* faz com que toda responsabilidade de instanciação para o Spring usando o sistema de injeção de dependencia */
	private PostagemRepository repository;

	@GetMapping /*sempre que vir uma requisição externa ele dispara o metodo*/
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());	
	}
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));		
	}
	@PostMapping
	public ResponseEntity<Postagem> post (@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	@PutMapping
	public ResponseEntity<Postagem> put (@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}
	@DeleteMapping("/{id}")  /*{} significa interpolação ou teamplate literal*/
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
