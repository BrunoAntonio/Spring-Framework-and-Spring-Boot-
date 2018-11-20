package com.bruno.projecto1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration //Configuração
@Profile("prod") //com o perfil produção.tem de ser activo na application.properties
                 //É possivel escolher entre a configuração de produção ou desenvolvimento
public class ProdConfig {
	
	@Bean
	public BeanProd beanProd() {
		return new BeanProd();
	}

}
