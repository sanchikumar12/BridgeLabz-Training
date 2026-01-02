package com.oopspracticescenariobasedquestions.vehiclerentalapplication;
public class Car extends Vehicle implements Rentable {
    private double insuranceCharge = 200;

    public Car(int vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    public double calculateRent(int days) {
        return (baseRate * days) + insuranceCharge;
    }
}
