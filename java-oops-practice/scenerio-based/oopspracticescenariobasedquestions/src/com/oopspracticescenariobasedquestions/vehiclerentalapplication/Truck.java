package com.oopspracticescenariobasedquestions.vehiclerentalapplication;

public class Truck extends Vehicle implements Rentable {
    private double loadCharge = 500;

    public Truck(int vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    public double calculateRent(int days) {
        return (baseRate * days) + loadCharge;
    }
}
