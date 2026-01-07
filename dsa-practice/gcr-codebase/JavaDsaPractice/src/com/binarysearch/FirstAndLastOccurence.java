package com.binarysearch;

import java.util.Scanner;


public class FirstAndLastOccurence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take sorted array elements
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Take target element
        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int first = findFirst(arr, n, target);
        int last = findLast(arr, n, target);

        // Print result
        if (first == -1) {
            System.out.println("First Occurrence: -1");
            System.out.println("Last Occurrence: -1");
        } else {
            System.out.println("First Occurrence Index: " + first);
            System.out.println("Last Occurrence Index: " + last);
        }

        sc.close();
    }

    // Find first occurrence
    public static int findFirst(int[] arr, int n, int target) {

        int left = 0;
        int right = n - 1;
        int result = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                result = mid;        // possible answer
                right = mid - 1;     // search left side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Find last occurrence
    public static int findLast(int[] arr, int n, int target) {

        int left = 0;
        int right = n - 1;
        int result = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                result = mid;        // possible answer
                left = mid + 1;      // search right side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
