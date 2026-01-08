package com.runtimeanalysis;

import java.util.*;

class SearchPerformanceComparison {

    // Linear Search: checks each element one by one
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    // Binary Search: works on sorted data
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dataset size
        System.out.print("Enter dataset size: ");
        int n = sc.nextInt();

        // Create dataset
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = i + 1;
        }

        // Read target value
        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        // Measure Linear Search time
        long start = System.nanoTime();
        linearSearch(data, target);
        long linearTime = System.nanoTime() - start;

        // Sort data and measure Binary Search time
        Arrays.sort(data);
        start = System.nanoTime();
        binarySearch(data, target);
        long binaryTime = System.nanoTime() - start;

        // Display results
        System.out.println("Linear Search Time (ms): " + linearTime / 1_000_000.0);
        System.out.println("Binary Search Time (ms): " + binaryTime / 1_000_000.0);

        sc.close();
    }
}
