package com.functionaiInterfaces.dataserializationforbackup;

public class SmartDashboard {

    public static void main(String[] args) {

        Vehicle normalCar = new Car();
        Vehicle evCar = new ElectricCar();

        normalCar.displaySpeed();
        normalCar.displayBatteryStatus();   

        System.out.println();

        evCar.displaySpeed();
        evCar.displayBatteryStatus();      
    }
}

