package com.oopspracticescenariobasedquestions.CabbyGo;

import java.sql.Driver;

//---------------------------
//RideServiceImpl.java
//---------------------------
public class Ride implements IRideService {

 private String pickupLocation;   // encapsulated
 private String dropLocation;     // encapsulated
 private double fare;             // encapsulated
 private boolean rideActive = false;

 public Ride(String pickup,String drop) {
	 this.pickupLocation=pickup;
	 this.dropLocation=drop;
	 
 }



 @Override
 public void endRide() {
	// TODO Auto-generated method stub
	 System.out.println("End Riding ..");
	
 }

 @Override
 public void bookRide(Vehicle vehicle, com.oopspracticescenariobasedquestions.CabbyGo.Driver driver, double distance) {
	  fare =vehicle.calculateFare(distance);
      System.out.println("Started Riding With fare.."+fare);
      System.out.println("Ride is for .."+pickupLocation);
      System.out.println("Ride is for .."+dropLocation);
	
 }






}
