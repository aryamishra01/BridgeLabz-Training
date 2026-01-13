package com.day9.homenest;

public class Light extends Device {

    public Light(int deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Light turned on");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Light turned off");
    }

    // Polymorphic behavior
    public void reset() {
        System.out.println("Light brightness reset");
        updateFirmwareLog("Light reset");
    }
}

