package com.oopspracticescenariobasedquestions.smarthomeautomation;


public class Light extends Appliance {

    public Light() {
        super(40); 
    }

    public void turnOn() {
        setOn(true);
        System.out.println("Light turned ON with soft brightness.");
    }

    public void turnOff() {
        setOn(false);
        System.out.println("Light turned OFF.");
    }
}
