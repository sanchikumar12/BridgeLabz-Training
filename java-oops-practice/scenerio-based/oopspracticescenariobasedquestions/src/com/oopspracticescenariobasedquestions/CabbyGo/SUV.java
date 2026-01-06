
package com.oopspracticescenariobasedquestions.CabbyGo;

public class SUV extends Vehicle {

	public SUV(String vehiclename, int capacity, String type) {
		super(vehiclename, capacity, type);
	}
	
	 @Override
	 public double calculateFare(double distance) {
	          int rate =60;   
			 
			 return rate*distance;
	    }

}
