package com.bruno.projecto1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //componente da interface veiculo
@Qualifier("bikeBean") //qualificação da interface veiculo como bike
public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("Iniciando bicicleta");

	}

	@Override
	public void stop() {
		System.out.println("Parando bicicleta");

	}

}
