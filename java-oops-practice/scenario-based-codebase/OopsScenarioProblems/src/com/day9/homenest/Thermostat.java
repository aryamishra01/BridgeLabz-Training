package com.day9.homenest;

public class Thermostat extends Device {

    public Thermostat(int deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat started");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat stopped");
    }

    public void reset() {
        System.out.println("Thermostat temperature reset");
        updateFirmwareLog("Thermostat reset");
    }
}

