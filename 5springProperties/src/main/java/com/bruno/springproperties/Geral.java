package com.bruno.springproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Geral implements ApplicationListener<ContextRefreshedEvent> {

	
	@Value("${geral.nome}") //para ir buscar o valor as propriedades
	private String nome;
	
	@Value("${geral.value}") //para ir buscar o valor as propriedades
	private String value;
	
	@Value("${my.servers[1]}")
	private String server;
	
	@Value("${my.environments.dev.url}")
	private String url;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println(nome);
		System.out.println(value);
		System.out.println(server);
		System.out.println(url);
	}
	
	

}
