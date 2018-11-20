package com.bruno.manytoone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.bruno.manytoone.Enums.StatusRole;
import com.bruno.manytoone.entities.Role;
import com.bruno.manytoone.entities.User;
import com.bruno.manytoone.repositories.UserRepository;

@Component
public class Initializer implements ApplicationListener<ContextRefreshedEvent> {

	//@Autowired
	//private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) { // dentro do metodo inserir o que se quer na base de
																	// dados

		Role role = new Role("Admin", StatusRole.ATIVO);

		// this.roleRepository.save(role); Não é necessário gravar devio ao cascade na classe User

		User user = new User();
		user.setName("Bruno");
		user.setEmail("bruno@gmail.com");
		user.setRole(role);

		this.userRepository.save(user);
		
		List <User> userList = this.userRepository.findAll();
		
		for (User u : userList) {
			Role role2=u.getRole();
			System.out.println(role2.getName());
		}

	}

}
