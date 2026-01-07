package com.day6.parkease;

import java.util.Scanner;

public class ParkEaseApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Slot initialization
        ParkingSlot slot = new ParkingSlot(101, "City Center", "Car");

        System.out.println("Enter vehicle type (Car/Bike/Truck): ");
        String type = sc.next();

        System.out.println("Enter vehicle number: ");
        String number = sc.next();

        System.out.println("Enter parking duration (in hours): ");
        int hours = sc.nextInt();

        Vehicle vehicle = null;

        // Polymorphism based on vehicle type
        if (type.equalsIgnoreCase("Car")) {
            vehicle = new Car(number);
        } else if (type.equalsIgnoreCase("Bike")) {
            vehicle = new Bike(number);
        } else if (type.equalsIgnoreCase("Truck")) {
            vehicle = new Truck(number);
        } else {
            System.out.println("Invalid vehicle type");
            return;
        }

        if (slot.isAvailable()) {
            slot.assignSlot();
            double bill = vehicle.calculateCharges(hours);

            System.out.println("\n--- Parking Receipt ---");
            System.out.println("Slot ID: " + slot.getSlotId());
            System.out.println("Vehicle Number: " + number);
            System.out.println("Total Charges: ₹" + bill);

            slot.freeSlot();
        } else {
            System.out.println("Parking slot not available");
        }

        sc.close();
    }
}
