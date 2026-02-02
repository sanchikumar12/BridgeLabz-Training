package com.functionaiInterfaces.dataserializationforbackup;

public interface Vehicle {

    void displaySpeed();

    default void displayBatteryStatus() {
        System.out.println("Battery status not applicable for this vehicle.");
    }
}
