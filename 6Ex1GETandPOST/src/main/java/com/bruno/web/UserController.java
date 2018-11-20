package com.bruno.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //porque está-se a usar a rest
public class UserController {

	
	//localhost:8080/user
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> getUser() {
		List<User> users = new ArrayList<>();
		User user = new User("Bruno", "bruno@gmail.com");
		User user1 = new User("Joana", "joana@gmail.com");

		users.add(user);
		users.add(user1);
		return users;
	}
	//localhost:8080/user/nome
	//inserir o nome(name) na pagina
	@RequestMapping(value = "/user/{name}", method = RequestMethod.GET)
	public List<User> getUser(@PathVariable String name) {
		List<User> users = new ArrayList<>();
		User user = new User("Bruno", "bruno@gmail.com");
		User user1 = new User("Joana", "joana@gmail.com");
		User user2 = new User(name, "joana@gmail.com");
		users.add(user);
		users.add(user1);
		users.add(user2);
		return users;
	}
	
	/* POST=Criar um novo usuario
	 * PUT=Fazer um update ao usuario
	 * GET=obter informação do lado do server de um usuario
	 * Nao podem ser enviados parametros pela url(com com .GET) tem de ser com JSON via postman
	 */
	@RequestMapping(value = "user", method = RequestMethod.POST)
	public User setUser (@RequestBody User user) {
		return user;
	}
	
	

}
