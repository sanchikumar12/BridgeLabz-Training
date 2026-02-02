package com.functionaiInterfaces.dataserializationforbackup;

public class ElectricCar implements Vehicle {
    @Override
    public void displaySpeed() {
        System.out.println("Electric Car speed: 90 km/h");
    }

    @Override
    public void displayBatteryStatus() {
        System.out.println("Battery Level: 75%");
    }
}

