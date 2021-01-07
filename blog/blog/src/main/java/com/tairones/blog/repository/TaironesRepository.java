package com.tairones.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tairones.blog.model.TaironesLive;

@Repository
public interface TaironesRepository extends JpaRepository<TaironesLive, Long> {
	public List<TaironesLive> findAllByTituloContainingIgnoreCase (String titulo);
}
