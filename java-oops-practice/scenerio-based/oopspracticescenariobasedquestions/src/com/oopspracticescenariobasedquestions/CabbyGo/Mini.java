package com.oopspracticescenariobasedquestions.CabbyGo;

public class Mini extends Vehicle {

	public Mini(String vehiclename, int capacity, String type) {
		super(vehiclename, capacity, type);
	}
	
	 @Override
	 public double calculateFare(double distance) {
	          int rate =60;   
			 
			 return rate*distance;
	    }

}
