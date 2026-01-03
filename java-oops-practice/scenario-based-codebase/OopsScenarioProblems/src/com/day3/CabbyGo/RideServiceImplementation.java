package com.day3.CabbyGo;

public class RideServiceImplementation implements IRideService {

    private Driver driver;
    private Vehicle vehicle;
    private boolean rideActive;

    public RideServiceImplementation(Driver driver, Vehicle vehicle) {
        this.driver = driver;
        this.vehicle = vehicle;
    }

    @Override
    public void bookRide(double distance) {
        rideActive = true;
        vehicle.calculateFare(distance);

        System.out.println("\nRide Booked Successfully!");
        System.out.println("Driver Name   : " + driver.getName());
        System.out.println("Vehicle Type : " + vehicle.getType());
        System.out.println("Distance     : " + distance + " km");
        System.out.println("Fare         : ₹" + vehicle.getFare());
    }

    @Override
    public void endRide() {
        if (rideActive) {
            rideActive = false;
            System.out.println("Ride Ended. Final Fare: ₹" + vehicle.getFare());
        } else {
            System.out.println("No active ride found.");
        }
    }
}
