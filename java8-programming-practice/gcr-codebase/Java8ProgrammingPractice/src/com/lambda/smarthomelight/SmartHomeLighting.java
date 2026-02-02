package com.lambda.smarthomelight;
public class SmartHomeLighting {

    public static void main(String[] args) {

        SmartLightController controller = new SmartLightController();

        controller.activateLight(() -> 
            System.out.println("Motion detected: Turning ON white lights")
        );

        controller.activateLight(() -> 
            System.out.println("Night time: Dimming lights to 30%")
        );

        controller.activateLight(() -> 
            System.out.println("Voice command received: Changing lights to BLUE")
        );
    }
}