package com.oopspracticescenariobasedquestions.smarthomeautomation;


public class AC extends Appliance {

    public AC() {
        super(1500);
    }

    public void turnOn() {
        setOn(true);
        System.out.println("AC cooling the room.");
    }

    public void turnOff() {
        setOn(false);
        System.out.println("AC turned OFF.");
    }
}
