package com.day5.eventease;

import java.util.Scanner;

public class EventEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking organizer details
        System.out.print("Enter Organizer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        User user = new User(name, email, phone);

        // Taking event details
        System.out.print("Enter Event ID: ");
        int eventId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Event Name: ");
        String eventName = sc.nextLine();

        System.out.print("Enter Location: ");
        String location = sc.nextLine();

        System.out.print("Enter Event Date: ");
        String date = sc.nextLine();

        System.out.print("Enter Number of Attendees: ");
        int attendees = sc.nextInt();

        System.out.print("Enter Venue Cost: ");
        double venueCost = sc.nextDouble();

        System.out.print("Enter Service Cost: ");
        double serviceCost = sc.nextDouble();

        System.out.print("Select Event Type (1-Birthday, 2-Conference): ");
        int choice = sc.nextInt();

        Event event;

        // Polymorphism at runtime
        if (choice == 1) {
            event = new BirthdayEvent(eventId, eventName, location, date, attendees, venueCost, serviceCost);
        } else {
            event = new ConferenceEvent(eventId, eventName, location, date, attendees, venueCost, serviceCost);
        }

        // Operations
        event.schedule();
        System.out.println("Total Event Cost: ₹" + event.calculateTotalCost());

        sc.close();
    }
}

