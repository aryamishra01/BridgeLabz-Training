package com.day6.fleetmanager;

import java.util.Scanner;

public class FleetManagerUsingMergeSort {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of vehicles from all depots: ");
        int n = sc.nextInt();
        sc.nextLine();

        Vehicle[] vehicles = new Vehicle[n];

        System.out.println("\nEnter vehicle data (each depot already sorted by mileage):");

        for (int i = 0; i < n; i++) {

            System.out.print("Vehicle ID: ");
            String id = sc.nextLine();

            System.out.print("Mileage: ");
            int mileage = sc.nextInt();
            sc.nextLine();

            vehicles[i] = new Vehicle(id, mileage);
        }

        System.out.println("\nDepot-wise Combined List (Before Merge Sort):");
        printVehicles(vehicles);

        FleetManager.mergeSort(vehicles, 0, n - 1);

        System.out.println("\nMaster Maintenance Schedule (After Merge Sort):");
        printVehicles(vehicles);

        sc.close();
    }

    static void printVehicles(Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}
