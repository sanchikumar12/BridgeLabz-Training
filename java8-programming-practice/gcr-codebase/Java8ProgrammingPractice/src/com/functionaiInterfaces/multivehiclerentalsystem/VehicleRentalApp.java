package com.functionaiInterfaces.multivehiclerentalsystem;

public class VehicleRentalApp {
	public static void main(String[] args) {
		Vehicle bike = new Bike();
		Vehicle bus = new Bus();
		
		bike.rent();
		bus.rent();
		
		bike.returnVehicle();
		bus.returnVehicle();
	}
}
