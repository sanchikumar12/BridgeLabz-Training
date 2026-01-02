package com.encapsulationandpolymorphism.VehicleManagement;

public abstract class Vehicle {
	public int vehicleNumber;
	public String type;
	public int rentalRate;
	
	public Vehicle(int vehicleNumber ,String type , int rentalRate) {
		this.vehicleNumber=vehicleNumber;
		this.type=type;
		this.rentalRate=rentalRate;
	}
	
	public int calculateRentalCost(int days) {
		return 0;
	}

}
