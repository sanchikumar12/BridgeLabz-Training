package com.oopspracticescenariobasedquestions.CabbyGo;

public class RidingApp {

	public static void main(String[] args) {
	    
		  Vehicle mini = new Mini("Maruti",5,"Mini");
	        Vehicle sedan = new Sedan("Sentro",4,"Sedan");
	        Vehicle suv = new SUV("Van",10,"SUV");

	        Driver driver = new Driver("Rohit Sharma", "DL87654321", 4.9);

	       Ride rideService = new Ride("Ratnagiri","Anand nagar");

	        rideService.bookRide(sedan, driver, 12.5);
	        rideService.endRide();
	}

}
