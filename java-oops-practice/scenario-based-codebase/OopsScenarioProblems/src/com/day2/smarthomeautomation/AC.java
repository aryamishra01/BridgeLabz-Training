package com.day2.smarthomeautomation;

public class AC extends Appliance {

    private int temperature = 24;

    public AC() {
        super(1500);
    }

    public AC(int power, int temperature) {
        super(power);
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("AC turned ON at " + temperature + "°C");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("AC turned OFF");
    }

    public int getTemperature() {
        return temperature;
    }
}

