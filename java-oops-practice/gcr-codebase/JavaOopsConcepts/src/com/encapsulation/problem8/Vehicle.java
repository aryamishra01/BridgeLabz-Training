package com.encapsulation.problem8;

public abstract class Vehicle implements GPS {

    // Encapsulated fields
    private int vehicleId;
    private String driverName;
    protected double ratePerKm;

    private String location;

    // Constructor
    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.location = "Unknown";
    }

    // Getters (encapsulation)
    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID   : " + vehicleId);
        System.out.println("Driver Name  : " + driverName);
        System.out.println("Rate per KM  : ₹" + ratePerKm);
        System.out.println("Location     : " + location);
    }

    // GPS methods
    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }

    // Abstract method
    public abstract double calculateFare(double distance);
}
