package com.encapsulation.problem8;

public class Auto extends Vehicle {

    public Auto(int vehicleId, String driverName) {
        super(vehicleId, driverName, 12); // Auto rate per km
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}
