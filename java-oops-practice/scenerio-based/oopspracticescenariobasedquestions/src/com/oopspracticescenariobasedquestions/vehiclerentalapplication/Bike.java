package com.oopspracticescenariobasedquestions.vehiclerentalapplication;



public class Bike extends Vehicle implements Rentable {

    public Bike(int vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }
    public double calculateRent(int days) {
        return baseRate * days;
    }
}
