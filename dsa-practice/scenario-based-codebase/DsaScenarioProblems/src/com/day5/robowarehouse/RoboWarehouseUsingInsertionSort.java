package com.day5.robowarehouse;

import java.util.Scanner;

public class RoboWarehouseUsingInsertionSort {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        Package[] shelf = new Package[n];

        System.out.println("Enter package weights (in kg):");
        for (int i = 0; i < n; i++) {
            System.out.print("Package " + (i + 1) + ": ");
            int weight = sc.nextInt();
            shelf[i] = new Package(weight);
        }

        System.out.println("\nShelf before sorting:");
        printShelf(shelf);

        RoboWarehouse.insertionSort(shelf);

        System.out.println("\nShelf after robot loads packages (sorted by weight):");
        printShelf(shelf);

        sc.close();
    }

    static void printShelf(Package[] shelf) {
        for (Package p : shelf) {
            System.out.print(p + "  ");
        }
        System.out.println();
    }
}
