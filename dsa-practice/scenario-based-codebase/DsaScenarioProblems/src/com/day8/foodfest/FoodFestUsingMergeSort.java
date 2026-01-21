package com.day8.foodfest;

import java.util.Scanner;

public class FoodFestUsingMergeSort {

	static Stall[] master = new Stall[0];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- FoodFest Management System ---");
            System.out.println("1. Add Zone Data");
            System.out.println("2. View All Stalls");
            System.out.println("3. Sort Stalls by Footfall (Merge Sort)");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addZoneData();
                    break;
                case 2:
                    display(master);
                    break;
                case 3:
                    master = mergeSort(master);
                    System.out.println("Sorted successfully!");
                    break;
                case 4:
                    System.out.println("Thank you for using FoodFest System!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Add Zone Data 
    public static void addZoneData() {

        System.out.print("Enter number of stalls in this zone: ");
        int n = sc.nextInt();

        Stall[] zone = new Stall[n];

        System.out.println("Enter stall data in SORTED order of footfall:");

        for (int i = 0; i < n; i++) {
            System.out.print("Stall name: ");
            String name = sc.next();

            System.out.print("Footfall: ");
            int footfall = sc.nextInt();

            zone[i] = new Stall(name, footfall);
        }

        master = merge(master, zone);
        System.out.println("Zone data added successfully!");
    }

    // Merge Sort
    public static Stall[] mergeSort(Stall[] arr) {

        if (arr.length <= 1)
            return arr;

        int mid = arr.length / 2;

        Stall[] left = new Stall[mid];
        Stall[] right = new Stall[arr.length - mid];

        for (int i = 0; i < mid; i++)
            left[i] = arr[i];

        for (int i = mid; i < arr.length; i++)
            right[i - mid] = arr[i];

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    // Merge Two Sorted Arrays
    public static Stall[] merge(Stall[] a, Stall[] b) {

        Stall[] result = new Stall[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i].footfall <= b[j].footfall) { // stable
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length)
            result[k++] = a[i++];

        while (j < b.length)
            result[k++] = b[j++];

        return result;
    }

    // Display
    public static void display(Stall[] arr) {

        if (arr.length == 0) {
            System.out.println("No stall data available.");
            return;
        }

        System.out.println("\nStall Performance List:");
        for (Stall s : arr) {
            System.out.println(s.name + " - Footfall: " + s.footfall);
        }
    }
}
