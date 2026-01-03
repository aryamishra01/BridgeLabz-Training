package com.encapsulation.problem8;

public class Bike extends Vehicle {

    public Bike(int vehicleId, String driverName) {
        super(vehicleId, driverName, 8); // Bike rate per km
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}
