package com.oopspracticescenariobasedquestions.CabbyGo;

public class Vehicle {
 private String vehicleNumber;
 private int capacity;
 private String type;

 public Vehicle(String vehicleNumber, int capacity, String type) {
     this.vehicleNumber = vehicleNumber;
     this.capacity = capacity;
     this.type = type;
 }

 public String getVehicleNumber() {
     return vehicleNumber;
 }

 public int getCapacity() {
     return capacity;
 }

 public String getType() {
     return type;
 }

 public double calculateFare(double distance) {
     return 0; 
 }
}

		
		
		
	


