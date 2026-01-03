package com.day3.CabbyGo;

public abstract class Vehicle {

    private String vehicleNumber;
    private int capacity;
    private String type;

    protected double baseFare;
    protected double ratePerKm;

    private double fare;   // sensitive data

    public Vehicle(String vehicleNumber, int capacity, String type,
                   double baseFare, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.baseFare = baseFare;
        this.ratePerKm = ratePerKm;
    }

    // Fare calculation using operators
    protected void calculateFare(double distance) {
        fare = baseFare + (distance * ratePerKm);
    }

    // Getters (controlled access)
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public double getFare() {
        return fare;
    }
}

