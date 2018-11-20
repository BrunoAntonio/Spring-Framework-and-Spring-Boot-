package com.bruno.manytoone.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bruno.manytoone.Enums.StatusRole;
import com.bruno.manytoone.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	//https://docs.spring.io/spring-data/jpa/docs/2.1.2.RELEASE/reference/html/
	
	List<Role> findByStatus (StatusRole status);
	
	
	
	
}
