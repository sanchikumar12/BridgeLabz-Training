package com.encapsulationandpolymorphism.VehicleManagement;

public class Truck extends Vehicle{
	public int vehicleNumber;
	public String type;
	public int rentalRate;
	public Truck(int vehicleNumber ,String type , int rentalRate) {
		super(vehicleNumber,type,rentalRate);
	}
	
	
	@Override
	public int calculateRentalCost(int days){
		return days*super.rentalRate;
	}
}
