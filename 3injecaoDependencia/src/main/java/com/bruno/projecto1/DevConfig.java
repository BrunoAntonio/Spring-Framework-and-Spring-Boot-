package com.bruno.projecto1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

	@Bean //Podia utilizaro o Autowired
		 //https://docs.spring.io/spring-javaconfig/docs/1.0.0.M4/reference/html/ch02s02.html
	public BeanDev beanDev() {
		return new BeanDev();
	}
	
}
