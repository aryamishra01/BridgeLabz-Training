package com.day9.medwarehouse;

import java.util.Scanner;

public class MedWarehouseUsingMergeSort {

	static Medicine[] master = new Medicine[0];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- Medical Warehouse System ---");
            System.out.println("1. Add Branch Medicine Data");
            System.out.println("2. View All Medicines");
            System.out.println("3. Sort by Expiry Date (Merge Sort)");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addBranchData();
                    break;
                case 2:
                    display(master);
                    break;
                case 3:
                    master = mergeSort(master);
                    System.out.println("Medicines sorted by full expiry date!");
                    break;
                case 4:
                    System.out.println("Warehouse system closed.");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Add Branch Data (Already Sorted)
    public static void addBranchData() {

        System.out.print("Enter number of medicines from branch: ");
        int n = sc.nextInt();

        Medicine[] branch = new Medicine[n];

        System.out.println("Enter medicine data in SORTED order of expiry:");

        for (int i = 0; i < n; i++) {

            System.out.print("Medicine name: ");
            String name = sc.next();

            System.out.print("Expiry Day: ");
            int day = sc.nextInt();

            System.out.print("Expiry Month: ");
            int month = sc.nextInt();

            System.out.print("Expiry Year: ");
            int year = sc.nextInt();

            branch[i] = new Medicine(name, day, month, year);
        }

        master = merge(master, branch);
        System.out.println("Branch data merged successfully!");
    }

    // -------- Merge Sort --------
    public static Medicine[] mergeSort(Medicine[] arr) {

        if (arr.length <= 1)
            return arr;

        int mid = arr.length / 2;

        Medicine[] left = new Medicine[mid];
        Medicine[] right = new Medicine[arr.length - mid];

        for (int i = 0; i < mid; i++)
            left[i] = arr[i];

        for (int i = mid; i < arr.length; i++)
            right[i - mid] = arr[i];

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    // Merge Two Sorted Arrays by FULL DATE 
    public static Medicine[] merge(Medicine[] a, Medicine[] b) {

        Medicine[] result = new Medicine[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {

            if (isEarlierOrSame(a[i], b[j])) {   // full date compare
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

    // returns true if m1 expiry <= m2 expiry
    public static boolean isEarlierOrSame(Medicine m1, Medicine m2) {

        if (m1.year != m2.year)
            return m1.year < m2.year;

        if (m1.month != m2.month)
            return m1.month < m2.month;

        return m1.day <= m2.day;
    }

    // Display
    public static void display(Medicine[] arr) {

        if (arr.length == 0) {
            System.out.println("No medicine data available.");
            return;
        }

        System.out.println("\nMedicine Inventory (Sorted by Expiry):");
        for (Medicine m : arr) {
            System.out.println(
                m.name + " | Expiry: " + m.day + "-" + m.month + "-" + m.year
            );
        }
    }
}
