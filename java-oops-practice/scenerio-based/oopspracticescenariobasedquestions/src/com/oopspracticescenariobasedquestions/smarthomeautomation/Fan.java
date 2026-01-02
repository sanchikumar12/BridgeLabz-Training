package com.oopspracticescenariobasedquestions.smarthomeautomation;

public class Fan extends Appliance {

    public Fan(int powerUsage) {
        super(powerUsage); 
    }

    public void turnOn() {
        setOn(true);
        System.out.println("Fan started spinning.");
    }

    public void turnOff() {
        setOn(false);
        System.out.println("Fan stopped.");
    }
}
