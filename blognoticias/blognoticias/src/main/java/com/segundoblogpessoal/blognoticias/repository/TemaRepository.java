package com.segundoblogpessoal.blognoticias.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.segundoblogpessoal.blognoticias.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}
