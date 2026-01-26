package com.day1.travellog;

import java.util.*;

public class TravelLogMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Trip> trips;

        try {
            trips = TravelFileUtil.loadTrips();
        } catch (Exception e) {
            trips = new ArrayList<>();
        }

        while (true) {

            System.out.println("\n===== TravelLog Menu =====");
            System.out.println("1. Add Trip");
            System.out.println("2. Show All Trips");
            System.out.println("3. Trips longer than 5 days");
            System.out.println("4. Unique countries visited");
            System.out.println("5. Search cities using regex");
            System.out.println("6. Top 3 most visited cities");
            System.out.println("7. Save & Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            try {
                switch (ch) {

                    case 1:
                        System.out.print("City: ");
                        String city = sc.nextLine();

                        System.out.print("Country: ");
                        String country = sc.nextLine();

                        System.out.print("Days: ");
                        int days = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Notes: ");
                        String notes = sc.nextLine();

                        trips.add(new Trip(city, country, days, notes));
                        System.out.println("Trip added!");
                        break;

                    case 2:
                        for (Trip t : trips)
                            System.out.println(t);
                        break;

                    case 3:
                        TravelAnalyzer.longTrips(trips);
                        break;

                    case 4:
                        TravelAnalyzer.uniqueCountries(trips);
                        break;

                    case 5:
                        System.out.print("Enter regex (ex: Del|Par): ");
                        String reg = sc.nextLine();
                        TravelAnalyzer.findCitiesRegex(trips, reg);
                        break;

                    case 6:
                        TravelAnalyzer.topCities(trips);
                        break;

                    case 7:
                        TravelFileUtil.saveTrips(trips);
                        System.out.println("Saved. Bye!");
                        return;

                    default:
                        System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
