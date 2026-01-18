package com.day6.icecreamrush;

import java.util.Scanner;

public class IceCreamRushUsingBubbleSort {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of flavors (max 8): ");
        int n = sc.nextInt();
        sc.nextLine();

        Flavor[] flavors = new Flavor[n];

        System.out.println("\nEnter flavor sales data:");

        for (int i = 0; i < n; i++) {
            System.out.print("Flavor name: ");
            String name = sc.nextLine();

            System.out.print("Times sold: ");
            int sales = sc.nextInt();
            sc.nextLine();

            flavors[i] = new Flavor(name, sales);
        }

        System.out.println("\nBefore Sorting (Original Popularity):");
        printFlavors(flavors);

        IceCreamRush.bubbleSort(flavors);

        System.out.println("\nAfter Sorting by Popularity (Least → Most Sold):");
        printFlavors(flavors);

        sc.close();
    }

    static void printFlavors(Flavor[] flavors) {
        for (Flavor f : flavors) {
            System.out.println(f);
        }
    }
}
