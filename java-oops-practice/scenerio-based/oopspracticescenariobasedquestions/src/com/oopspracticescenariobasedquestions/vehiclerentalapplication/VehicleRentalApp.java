package com.oopspracticescenariobasedquestions.vehiclerentalapplication;
public class VehicleRentalApp {
    public static void main(String[] args) {

        Rentable bike = new Bike(1, "Yamaha", 300);
        Rentable car = new Car(2, "Honda", 1000);
        Rentable truck = new Truck(3, "Tata", 2000);

        Customer customer = new Customer(101, "Amit");

        customer.rentVehicle(bike, 3);
        customer.rentVehicle(car, 2);
        customer.rentVehicle(truck, 1);
    }
}

