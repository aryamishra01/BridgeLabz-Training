package com.day7.tourmate;

import java.util.Scanner;

public class TourMateApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input for trip details
        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Trip Duration (days): ");
        int duration = sc.nextInt();

        System.out.print("Enter Transport Cost: ");
        double transportCost = sc.nextDouble();

        System.out.print("Enter Hotel Cost: ");
        double hotelCost = sc.nextDouble();

        System.out.print("Enter Activity Cost: ");
        double activityCost = sc.nextDouble();

        // Creating associated objects
        Transport transport = new Transport(transportCost);
        Hotel hotel = new Hotel(hotelCost);
        Activity activity = new Activity(activityCost);

        System.out.println("\nSelect Trip Type:");
        System.out.println("1. Domestic Trip");
        System.out.println("2. International Trip");
        int choice = sc.nextInt();

        Trip trip;

        // Polymorphism: object creation at runtime
        if (choice == 1) {
            trip = new DomesticTrip(destination, duration, transport, hotel, activity);
        } else {
            trip = new InternationalTrip(destination, duration, transport, hotel, activity);
        }

        // Booking the trip
        trip.book();

        // Optional cancellation
        System.out.print("\nDo you want to cancel the trip? (yes/no): ");
        sc.nextLine(); // consume newline
        String cancelChoice = sc.nextLine();

        if (cancelChoice.equalsIgnoreCase("yes")) {
            trip.cancel();
        }

        sc.close();
    }
}

