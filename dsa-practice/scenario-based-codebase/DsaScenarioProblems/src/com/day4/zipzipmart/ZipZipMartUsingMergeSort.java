package com.day4.zipzipmart;

import java.util.Scanner;

public class ZipZipMartUsingMergeSort {

	// Merge sort method to sort sales by date and then by amount
    static void mergeSort(Sale[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            // Divide the array into two halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted parts of the array
    static void merge(Sale[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Sale[] L = new Sale[n1];
        Sale[] R = new Sale[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        // Merge back into original array in sorted order
        while (i < n1 && j < n2) {

            // Compare by date first
            int dateCompare = L[i].date.compareTo(R[j].date);

            if (dateCompare < 0) {
                arr[k] = L[i];
                i++;
            }
            else if (dateCompare > 0) {
                arr[k] = R[j];
                j++;
            }
            else {
                // If dates are same, compare by amount
                if (L[i].amount <= R[j].amount) {
                    arr[k] = L[i];
                    i++;
                }
                else {
                    arr[k] = R[j];
                    j++;
                }
            }
            k++;
        }

        // Copy remaining elements from left array
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements from right array
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Method to display sales records
    static void displaySales(Sale[] arr, int n) {
        System.out.println("Date\t\tAmount");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].date + "\t" + arr[i].amount);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sales records: ");
        int n = sc.nextInt();

        Sale[] sales = new Sale[n];

        // Taking input of sales records
        for (int i = 0; i < n; i++) {

            System.out.println("Enter details for sale " + (i + 1));

            System.out.print("Enter date in format YYYY-MM-DD: ");
            String date = sc.next();

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            sales[i] = new Sale(date, amount);
        }

        // Display before sorting
        System.out.println("\nSales records before sorting");
        displaySales(sales, n);

        // Apply merge sort
        mergeSort(sales, 0, n - 1);

        // Display after sorting
        System.out.println("\nSales records after sorting by date and amount");
        displaySales(sales, n);

        sc.close();
    }
}
