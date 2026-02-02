package com.functionaiInterfaces.multivehiclerentalsystem;

public class Bike implements Vehicle{

	@Override
	public void rent() {
		System.out.println("You have rented the bike");
		
	}

	@Override
	public void returnVehicle() {
		System.out.println("You have return bike");
	}

}
