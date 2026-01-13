package com.day9.homenest;

public class Lock extends Device {

    public Lock(int deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Lock engaged");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Lock disengaged");
    }

    public void reset() {
        System.out.println("Lock security reset");
        updateFirmwareLog("Lock reset");
    }
}

