package br.com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public List<User> findAllByNameContainingIgnoreCase(String name);

}
