package com.bruno.projecto1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleComponent {

	@Autowired //ligação à interface 
	@Qualifier("bikeBean") //qualifica a interface como bike
	private Vehicle vehicle;
	
	public void service() {
		vehicle.start();
		vehicle.stop();
	}
}
