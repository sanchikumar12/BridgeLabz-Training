package com.constructor.level1;
class Vehicle {

    // Instance Variables
    private String ownerName;
    private String vehicleType;

    // Class Variable (fixed for all vehicles)
    private static double registrationFee = 5000;  // default fee

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name         : " + ownerName);
        System.out.println("Vehicle Type       : " + vehicleType);
        System.out.println("Registration Fee   : ₹" + registrationFee);
        System.out.println();
    }

    // Class Method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}


// Driver Class
public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Raj Kumar", "Car");
        Vehicle v2 = new Vehicle("Anita Sharma", "Motorcycle");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Updating registration fee for all vehicles
        Vehicle.updateRegistrationFee(6500);

        // After updating fee
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
