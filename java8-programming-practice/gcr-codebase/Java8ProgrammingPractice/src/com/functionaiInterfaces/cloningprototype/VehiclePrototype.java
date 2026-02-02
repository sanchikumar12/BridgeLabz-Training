package com.functionaiInterfaces.cloningprototype;

public class VehiclePrototype implements Cloneable {

    public String model;
    private int speed;

    public VehiclePrototype(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Model: " + model + ", Speed: " + speed);
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
}

