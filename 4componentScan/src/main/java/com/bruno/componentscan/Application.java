package com.bruno.componentscan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.bruno.componentscan.controller.MyController;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bruno.componentscan.controller","com.bruno.componentscan.service"})
//Não é necessário escrever o componentscan porque ele é feito automaticamente 
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		MyController controller =(MyController)ctx.getBean("myController");
		controller.hello();
	}
}
