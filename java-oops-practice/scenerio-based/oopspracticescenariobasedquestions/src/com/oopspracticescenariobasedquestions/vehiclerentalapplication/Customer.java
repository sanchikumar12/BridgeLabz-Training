package com.oopspracticescenariobasedquestions.vehiclerentalapplication;

public class Customer {
    private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void rentVehicle(Rentable vehicle, int days) {
        System.out.println(name + " rented vehicle for " + days + " days");
        System.out.println("Total Rent: " + vehicle.calculateRent(days));
    }
}
