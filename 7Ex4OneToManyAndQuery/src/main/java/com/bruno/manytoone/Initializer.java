package com.bruno.manytoone;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.bruno.manytoone.Enums.StatusRole;
import com.bruno.manytoone.entities.Functionality;
import com.bruno.manytoone.entities.Role;
import com.bruno.manytoone.entities.User;
import com.bruno.manytoone.repositories.UserRepository;

@Component
public class Initializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) { // dentro do metodo inserir o que se quer na base
																	// dedados

		Functionality functionality = new Functionality();
		functionality.setName("Add");

		Functionality functionality1 = new Functionality();
		functionality1.setName("Delete");

		Role role = new Role("Admin", StatusRole.ATIVO, Arrays.asList(functionality));

		Role role1 = new Role("Aluno", StatusRole.ATIVO, Arrays.asList(functionality1));

		User user = new User();
		user.setName("Bruno");
		user.setEmail("bruno@gmail.com");
		user.setRoles(Arrays.asList(role, role1));
		this.userRepository.save(user);
		
		User user1 = new User();
		user1.setName("Sara");
		user1.setEmail("sara@gmail.com");
		this.userRepository.save(user1);

		User userU = this.userRepository.findByName("Sara");
		User userS = this.userRepository.findByEmail("bruno@gmail.com");
		User userE = this.userRepository.findByName1("Sa");
		User userA = this.userRepository.findByName1("ra");
		
		System.out.println(userU.getEmail());
		System.out.println(userS.getName());
		System.out.println(userE.getName());
		System.out.println(userA.getName());

	}

}