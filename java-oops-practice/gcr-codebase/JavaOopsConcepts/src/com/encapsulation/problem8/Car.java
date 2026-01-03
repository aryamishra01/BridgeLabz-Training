package com.encapsulation.problem8;

public class Car extends Vehicle {

    public Car(int vehicleId, String driverName) {
        super(vehicleId, driverName, 15); // Car rate per km
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}
