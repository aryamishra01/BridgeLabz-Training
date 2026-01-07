package com.binarysearch;

import java.util.Scanner;

public class FindPeakElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        // Binary Search for peak element
        while (left <= right) {

            int mid = (left + right) / 2;

            // Check if mid is a peak
            boolean leftOK = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOK = (mid == n - 1) || (arr[mid] > arr[mid + 1]);

            if (leftOK && rightOK) {
                System.out.println("Peak element found: " + arr[mid]);
                System.out.println("Peak index: " + mid);
                break;
            }

            // If left neighbor is greater, search left half
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } 
            // Else search right half
            else {
                left = mid + 1;
            }
        }

        sc.close();
    }
}

