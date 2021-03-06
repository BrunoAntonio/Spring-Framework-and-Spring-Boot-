package com.bruno.api.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.bruno.api.entities.User;

public interface UserRepository extends MongoRepository<User, Long> {
	
	/* Não funciona porque a interface estende MongoRepository
	@Query("select u from User u Where u.name like %?1%")
	UserMongo findByNameLetters (String name);
	*/
	
	
	//https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/
	@Query("{ 'email' : ?0 }")
	User findByEmailLetters (String email);
	
	
	//Table 7
	User findByEmail (String email);
	User findByNameIgnoreCase (String name);
	User findByNameIgnoreCaseLike (String name);
}
