package com.bruno.manytoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.bruno.manytoone.Enums.StatusRole;
import com.bruno.manytoone.entities.Role;
import com.bruno.manytoone.repositories.RoleRepository;

@Component
public class Initializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private RoleRepository roleRepository;



	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) { // dentro do metodo inserir o que se quer na base de
																	// dados

		//Criar os 1000 perfis
		for (int i = 0; i < 1000; i++) {
			this.saveRole("Admin", StatusRole.ATIVO);
		}

		for (int i = 0; i < 1000; i++) {
			this.saveRole("Aluno", StatusRole.INACTIVO);
		}
		//obter os 10 primeiros registos 
		PageRequest pageable=PageRequest.of(10, 10);
		Page<Role> rolesPage=this.roleRepository.findAll(pageable);
		
		for (Role r: rolesPage ) {
			System.out.println(r.getName());
		}
		

	}

	public void saveRole(String name, StatusRole status) { // Metodo para gravar os 1000 perfis
		Role role = new Role(name, status);
		this.roleRepository.save(role);
	}

}
