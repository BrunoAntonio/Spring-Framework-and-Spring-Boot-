package com.bruno.projecto1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //componente da interface veiculo
@Qualifier("carBean") //qualificação da interface veiculo como carro
public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Iniciando carro");
		
	}

	@Override
	public void stop() {
		System.out.println("Parando carro");
		
	}

}
