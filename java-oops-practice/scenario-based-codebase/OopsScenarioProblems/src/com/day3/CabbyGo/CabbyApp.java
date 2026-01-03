package com.day3.CabbyGo;

import java.util.Scanner;

public class CabbyApp {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Driver input
        System.out.print("Enter Driver Name: ");
        String driverName = input.nextLine();

        System.out.print("Enter License Number: ");
        String licenseNumber = input.nextLine();

        System.out.print("Enter Driver Rating: ");
        double rating = input.nextDouble();
        input.nextLine();

        Driver driver = new Driver(driverName, licenseNumber, rating);

        // Vehicle input
        System.out.println("\nSelect Vehicle Type:");
        System.out.println("1. Mini");
        System.out.println("2. Sedan");
        System.out.println("3. SUV");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        input.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = input.nextLine();

        Vehicle vehicle = null;

        // Polymorphism at runtime
        switch (choice) {
            case 1:
                vehicle = new Mini(vehicleNumber);
                break;
            case 2:
                vehicle = new Sedan(vehicleNumber);
                break;
            case 3:
                vehicle = new SUV(vehicleNumber);
                break;
            default:
                System.out.println("Invalid vehicle choice!");
                System.exit(0);
        }

        // Distance input
        System.out.print("\nEnter Ride Distance (km): ");
        double distance = input.nextDouble();

        // Ride service
        IRideService rideService = new RideServiceImplementation(driver, vehicle);

        rideService.bookRide(distance);
        rideService.endRide();

        input.close();
    }
}
