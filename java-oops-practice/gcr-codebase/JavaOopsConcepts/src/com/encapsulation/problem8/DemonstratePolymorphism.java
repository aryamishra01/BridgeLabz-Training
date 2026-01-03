package com.encapsulation.problem8;

public class DemonstratePolymorphism {

	// Polymorphic method
    public static void calculateRideFare(Vehicle vehicle, double distance) {
        System.out.println("\n--- Ride Details ---");
        vehicle.getVehicleDetails();
        System.out.println("Distance     : " + distance + " km");
        System.out.println("Total Fare   : ₹" + vehicle.calculateFare(distance));
    }

    public static void main(String[] args) {

        Vehicle car = new Car(101, "Rahul");
        Vehicle bike = new Bike(102, "Amit");
        Vehicle auto = new Auto(103, "Suresh");

        car.updateLocation("MG Road");
        bike.updateLocation("Bus Stand");
        auto.updateLocation("Railway Station");

        calculateRideFare(car, 10);
        calculateRideFare(bike, 5);
        calculateRideFare(auto, 8);
    }
}
