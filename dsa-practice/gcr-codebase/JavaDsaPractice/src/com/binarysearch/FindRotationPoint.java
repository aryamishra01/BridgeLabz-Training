package com.binarysearch;

import java.util.Scanner;

public class FindRotationPoint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take array elements (rotated sorted array)
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        // Binary Search to find rotation point
        while (left < right) {

            int mid = (left + right) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // left == right -> index of smallest element
        System.out.println("Rotation point index: " + left);
        System.out.println("Smallest element: " + arr[left]);

        sc.close();
    }
}

