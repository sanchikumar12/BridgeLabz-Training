package com.functionaiInterfaces.cloningprototype;

public class PrototypeTest {

    public static void main(String[] args) {

        try {
            VehiclePrototype original =
                    new VehiclePrototype("Tesla Model X", 120);

            VehiclePrototype cloned =
                    (VehiclePrototype) original.clone();

            System.out.println("Original Object:");
            original.display();

            System.out.println("Cloned Object:");
            cloned.display();

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}

