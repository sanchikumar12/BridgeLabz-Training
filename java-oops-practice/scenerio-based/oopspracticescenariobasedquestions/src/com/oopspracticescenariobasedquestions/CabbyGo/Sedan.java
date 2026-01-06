package com.oopspracticescenariobasedquestions.CabbyGo;

public class Sedan  extends Vehicle{

	public Sedan(String vehiclename, int capacity, String type) {
		super(vehiclename, capacity, type);
		
	}
	
	
	 @Override
	 public double calculateFare(double distance) {
	     int rate =50;   
		 
		 return rate*distance;
	    }

}
