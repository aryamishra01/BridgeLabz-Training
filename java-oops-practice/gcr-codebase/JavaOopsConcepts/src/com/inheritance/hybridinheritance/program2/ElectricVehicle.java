package com.inheritance.hybridinheritance.program2;

public class ElectricVehicle extends Vehicle {

    int batteryCapacity; // in kWh

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging electric vehicle...");
        System.out.println("Battery Capacity : " + batteryCapacity + " kWh");
    }
}
