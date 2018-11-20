package com.bruno.projecto1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Projecto1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Projecto1Application.class, args);
	
		//Chamar um método na classe principal
		MyController controller = (MyController) ctx.getBean("myController");
		
		VehicleComponent component= (VehicleComponent) ctx.getBean("vehicleComponent");
		
	
		
		controller.hello();
		component.service();
	}
}