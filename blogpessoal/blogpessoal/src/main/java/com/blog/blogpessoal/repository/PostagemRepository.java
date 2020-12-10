package com.blog.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	

}
