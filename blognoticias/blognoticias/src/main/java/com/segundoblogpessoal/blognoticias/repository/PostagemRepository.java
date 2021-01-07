package com.segundoblogpessoal.blognoticias.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.segundoblogpessoal.blognoticias.model.Postagem;
/*sempre extends do model muito importante*/  /*sempre trazer a tipagem no no modo primitivo exemplo long com L maiusculo*/

@Repository									/*o JPA hibernate ja vem alguns contratos como PUT DELETE GET E POST*/
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
		public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
}
