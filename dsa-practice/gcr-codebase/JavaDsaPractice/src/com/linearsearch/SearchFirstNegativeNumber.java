package com.linearsearch;

import java.util.Scanner;

public class SearchFirstNegativeNumber {

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

        // Linear search for first negative number
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                index = i;
                break;
            }
        }

        // Print result
        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found");
        }

        sc.close();
    }
}
