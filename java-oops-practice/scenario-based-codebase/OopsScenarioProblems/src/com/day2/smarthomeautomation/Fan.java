package com.day2.smarthomeautomation;

public class Fan extends Appliance {

    public Fan() {
        super(75);
    }

    public Fan(int power) {
        super(power);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Fan started rotating");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Fan stopped");
    }
}
