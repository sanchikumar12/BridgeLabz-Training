package com.oopspracticescenariobasedquestions.smarthomeautomation;

public abstract class Appliance implements Controllable {
    private boolean isOn;          
    private int powerUsage;        

    public Appliance(int powerUsage) { 
        this.powerUsage = powerUsage;
        this.isOn = false;
    }

    protected void setOn(boolean status) {
        isOn = status;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getPowerUsage() {
        return powerUsage;
    }
}
