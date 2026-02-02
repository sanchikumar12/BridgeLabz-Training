package com.functionaiInterfaces.multivehiclerentalsystem;

public class Bus implements Vehicle{

	@Override
	public void rent() {
		System.out.println("Your have rent bus");
	}

	@Override
	public void returnVehicle() {
		System.out.println("Your have return bus");
	}

}
