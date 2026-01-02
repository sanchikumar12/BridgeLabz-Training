package com.oopspracticescenariobasedquestions.smarthomeautomation;
public class HomeMain {
    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan(75);
        Appliance ac = new AC();

        UserController controller = new UserController();

        controller.operate(light, true);
        controller.operate(ac, true);

        controller.compareUsage(fan, ac);

        controller.operate(light, false);
    }
}
