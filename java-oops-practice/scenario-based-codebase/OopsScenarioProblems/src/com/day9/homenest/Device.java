package com.day9.homenest;

public abstract class Device implements IControllable {

    protected int deviceId;
    private boolean status;          // Cannot be modified externally
    protected double energyUsage;

    private String firmwareLog;       // Secured firmware log

    // Constructor to register device
    public Device(int deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareLog = "Initialized";
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    // Energy usage calculation
    public double calculateEnergy(int hours) {
        return energyUsage * hours;
    }

    protected void updateFirmwareLog(String log) {
        firmwareLog = log;
    }
}

