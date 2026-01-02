package com.encapsulationandpolymorphism.VehicleManagement;

public class VehicleSystem {

	public static void main(String[] args) {
		
		Bike bike =new 	Bike(234567,"Bike",80);
        int res=bike.calculateRentalCost(10);
        System.out.println("The Total days rate is  for Bike is : "+res);
        
		Car car =new Car(234567,"Bmw",8);
        int res1=car.calculateRentalCost(10);
        System.out.println("The Total days rate for car :"+res1);
        
        Truck truck =new Truck(234567,"Truck",5);
        int res2=car.calculateRentalCost(10);
        System.out.println("The Total days rate for truck is : "+res2);
        
        
	}

}
