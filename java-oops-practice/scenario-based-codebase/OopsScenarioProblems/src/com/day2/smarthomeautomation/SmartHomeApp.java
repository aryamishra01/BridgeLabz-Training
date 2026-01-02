package com.day2.smarthomeautomation;

public class SmartHomeApp {

	public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan(80);
        Appliance ac = new AC(1600, 22);

        UserController controller = new UserController();

        controller.controlDevice(light, true);
        controller.controlDevice(fan, true);
        controller.controlDevice(ac, true);

        System.out.println();

        controller.compareEnergy(light, fan);
        controller.compareEnergy(ac, light);

        System.out.println();

        controller.controlDevice(ac, false);
    }
}
