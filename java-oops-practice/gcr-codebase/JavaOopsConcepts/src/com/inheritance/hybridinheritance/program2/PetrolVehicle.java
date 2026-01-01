package com.inheritance.hybridinheritance.program2;

public class PetrolVehicle extends Vehicle implements Refuelable {

    int fuelCapacity; // in liters

    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling petrol vehicle...");
        System.out.println("Fuel Capacity : " + fuelCapacity + " liters");
    }
}

