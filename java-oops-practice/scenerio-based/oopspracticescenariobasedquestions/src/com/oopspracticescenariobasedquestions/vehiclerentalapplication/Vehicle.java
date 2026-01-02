package com.oopspracticescenariobasedquestions.vehiclerentalapplication;

public class Vehicle {
    protected int vehicleId;
    protected String brand;
    protected double baseRate;

    public Vehicle(int vehicleId, String brand, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    // Encapsulation (Getters & Setters)
    public int getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public double getBaseRate() {
        return baseRate;
    }
}
