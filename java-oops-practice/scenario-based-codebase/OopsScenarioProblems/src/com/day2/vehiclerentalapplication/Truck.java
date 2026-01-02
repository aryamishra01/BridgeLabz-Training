package com.day2.vehiclerentalapplication;

public class Truck extends Vehicle implements Rentable {

    private double loadCharge;

    public Truck(int vehicleId, String brand, double baseRate, double loadCharge) {
        super(vehicleId, brand, baseRate);
        this.loadCharge = loadCharge;
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate + loadCharge) * days;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Truck");
        System.out.println("Load Charge per Day: ₹" + loadCharge);
    }
}
