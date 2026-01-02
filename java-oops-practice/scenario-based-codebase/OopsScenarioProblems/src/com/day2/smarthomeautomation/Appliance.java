package com.day2.smarthomeautomation;

public abstract class Appliance implements Controllable {

    private boolean isOn;
    private int powerConsumption; // watts

    // Default constructor
    public Appliance() {
        this.powerConsumption = 50;
    }

    // User-defined power setting
    public Appliance(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    protected void setOn(boolean status) {
        this.isOn = status;
    }

    protected boolean isOn() {
        return isOn;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    protected void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void showStatus() {
        System.out.println("Power: " + powerConsumption + "W | Status: " +
                (isOn ? "ON" : "OFF"));
    }
}

