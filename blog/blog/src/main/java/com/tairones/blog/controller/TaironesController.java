package com.tairones.blog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tairones.blog.model.TaironesLive;
import com.tairones.blog.repository.TaironesRepository;


@RestController
@RequestMapping("/live")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class TaironesController {
	
	@Autowired
	private TaironesRepository repository;
	
	@GetMapping
		public ResponseEntity<List<TaironesLive>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
		@GetMapping("/{id}")
		public ResponseEntity<TaironesLive> getById(@PathVariable long id){
			Optional<TaironesLive> live = repository.findById(id);
			
			if(live.isPresent())
				return ResponseEntity.ok(live.get());
			
		return ResponseEntity.badRequest().build();
	}
}
