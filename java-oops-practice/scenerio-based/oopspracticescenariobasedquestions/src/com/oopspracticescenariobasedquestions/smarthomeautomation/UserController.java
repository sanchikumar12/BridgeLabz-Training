package com.oopspracticescenariobasedquestions.smarthomeautomation;



public class UserController {

    public void operate(Controllable device, boolean power) {
        if (power) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    public void compareUsage(Appliance a1, Appliance a2) {
        if (a1.getPowerUsage() > a2.getPowerUsage()) {
            System.out.println("First appliance uses more power.");
        } else if (a1.getPowerUsage() < a2.getPowerUsage()) {
            System.out.println("Second appliance uses more power.");
        } else {
            System.out.println("Both appliances use equal power.");
        }
    }
}
