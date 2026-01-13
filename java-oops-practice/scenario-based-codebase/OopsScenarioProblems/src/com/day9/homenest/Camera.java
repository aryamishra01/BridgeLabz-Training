package com.day9.homenest;

public class Camera extends Device {

    public Camera(int deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Camera activated");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Camera deactivated");
    }

    public void reset() {
        System.out.println("Camera rebooted");
        updateFirmwareLog("Camera reset");
    }
}
