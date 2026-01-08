package com.challengeproblems;

import java.util.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LinearAndBinarySearchProgram {

    // Linear Search: First Missing Positive Integer
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n + 1];

        // Mark visited positive numbers
        for (int num : arr) {
            if (num > 0 && num <= n) {
                visited[num] = true;
            }
        }

        // Find the first missing positive integer
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }
        }
        return n + 1;
    }

    // Binary Search: Find Target Index 
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array input from user
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers (space-separated or one by one):");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Take target input for binary search
        System.out.print("Enter target number for Binary Search: ");
        int target = sc.nextInt();

        // Using Linear Search
        int missing = findFirstMissingPositive(numbers);
        System.out.println("First Missing Positive Integer: " + missing);

        // Using Binary Search 
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println("Target found at index (Binary Search): " + index);
        } else {
            System.out.println("Target not found in the array.");
        }

        sc.close();
    }
}
