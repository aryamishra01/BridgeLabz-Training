package com.day2.smarthomeautomation;

public class Light extends Appliance {

    public Light() {
        super(20); // default LED light
    }

    public Light(int power) {
        super(power);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Light turned ON (soft glow enabled)");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Light turned OFF");
    }
}
