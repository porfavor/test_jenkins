package com.digitpeer.t;

public class Driver {
	private IVehicle vehicle;
	
	public Driver(IVehicle vehicle){
		this.vehicle = vehicle;
	}
	
	public void pickup(){
		vehicle.stop();
		//do sth
		vehicle.start();
	}
}
