package com.bruno.api.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.bruno.api.entities.User;
import com.bruno.api.repositories.UserRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		List<User> users = userRepository.findAll();

		if (users.isEmpty()) {
			createUser("Bruno", "brunocardoso@gmail.com");
			createUser("Tânia", "tania@gmail.com");
			createUser("Sara", "Sara@gmail.com");
		}
		User user = userRepository.findByNameIgnoreCaseLike("bru");
		System.out.println(user.getName());
		
		User user1 = userRepository.findByEmail("Sara@gmail.com");
		System.out.println(user1.getName());

		User user2 = userRepository.findByNameIgnoreCase("tânia");
		System.out.println(user2.getName());
		
		User user3 = userRepository.findByEmailLetters("brunocardoso@gmail.com");
		System.out.println(user3.getName());
		

	}

	public void createUser(String name, String email) {
		User user = new User(name, email);
		userRepository.save(user);
	}

}
