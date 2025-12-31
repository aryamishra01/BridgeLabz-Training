/*
Bus Route Distance Tracker 
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/

import java.util.Scanner;

public class BusRouteDistanceTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int stop = 1;
        double totalDistance = 0;
        String choice = "no";

        System.out.println("-----Bus Route Distance Tracker-----");

        while (choice.equals("no")) {

            System.out.println("Reached stop " + stop);
            totalDistance += 10;   // each stop adds 10 km

            System.out.println("Distance covered so far: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (yes/no): ");
            choice = input.next();

            stop++;
        }

        System.out.println("\nPassenger got off the bus.");
        System.out.println("Total distance traveled: " + totalDistance + " km");
    }
}
