package com.inheritance.levelone;



public class Motorcycle extends Vehicle {
    private boolean hasABS;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasABS) {
        super(maxSpeed, fuelType);
        this.hasABS = hasABS;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nMotorcycle Info:");
        super.displayInfo();
        System.out.println("Has ABS: " + (hasABS ? "Yes" : "No"));
    }
}
