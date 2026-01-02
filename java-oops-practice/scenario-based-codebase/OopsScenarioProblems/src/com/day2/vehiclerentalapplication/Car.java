package com.day2.vehiclerentalapplication;

public class Car extends Vehicle implements Rentable {

    private double acCharge = 200; // per day

    public Car(int vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate + acCharge) * days;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Car");
        System.out.println("AC Charge per Day: ₹" + acCharge);
    }
}
