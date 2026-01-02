package com.inheritance.levelone;



public class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nCar Info:");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
