package com.bruno.manytoone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bruno.manytoone.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
	//https://docs.spring.io/spring-data/jpa/docs/2.1.2.RELEASE/reference/html/
	//É melhor do que utilizar o @Query
	User findByName(String name);
	User findByEmail(String email);
	
	@Query("select u  from User u where u.name like %?1%")
	User findByName1(String name);
	
	@Query("select u  from User u where u.name like %?1")
	User findByName2(String name);

}
