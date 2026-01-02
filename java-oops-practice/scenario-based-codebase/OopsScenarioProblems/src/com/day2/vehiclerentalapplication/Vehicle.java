package com.day2.vehiclerentalapplication;

public class Vehicle {

    protected int vehicleId;
    protected String brand;
    protected double baseRate; // per day

    public Vehicle(int vehicleId, String brand, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    // Encapsulation via getters/setters
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    // Polymorphic method
    public void displayInfo() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Base Rate per Day: ₹" + baseRate);
    }
}
