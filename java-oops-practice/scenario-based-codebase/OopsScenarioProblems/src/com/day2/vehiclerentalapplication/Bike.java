package com.day2.vehiclerentalapplication;

public class Bike extends Vehicle implements Rentable {

    public Bike(int vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        // Simple rent calculation
        return baseRate * days;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Bike");
    }
}
