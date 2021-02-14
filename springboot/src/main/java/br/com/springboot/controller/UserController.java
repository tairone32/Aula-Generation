package br.com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.model.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public User user() {
		User user = new User();
		return user;
	}
	
	@PostMapping("/")
	public User user(@RequestBody User user) {
		return user;
	}
		
/*top*/
}
