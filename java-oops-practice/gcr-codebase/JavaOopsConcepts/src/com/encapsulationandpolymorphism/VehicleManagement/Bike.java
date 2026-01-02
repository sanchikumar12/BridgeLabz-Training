package com.encapsulationandpolymorphism.VehicleManagement;

public class Bike extends Vehicle{
	public int vehicleNumber;
	public String type;
	public int rentalRate;
	public Bike(int vehicleNumber ,String type , int rentalRate) {
		super(vehicleNumber,type,rentalRate);
	}
	
	
	@Override
	public int calculateRentalCost(int days){
		return days*super.rentalRate;
	}}

