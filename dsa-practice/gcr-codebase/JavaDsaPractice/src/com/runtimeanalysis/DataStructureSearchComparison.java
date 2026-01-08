package com.runtimeanalysis;

import java.util.*;

class DataStructureSearchComparison {

    // Linear search in array
    public static boolean arraySearch(int[] arr, int target) {
        for (int x : arr) {
            if (x == target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dataset size
        System.out.print("Enter dataset size: ");
        int n = sc.nextInt();

        // Read target element
        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int[] array = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Populate data structures
        for (int i = 0; i < n; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // Array search timing
        long start = System.nanoTime();
        arraySearch(array, target);
        long arrayTime = System.nanoTime() - start;

        // HashSet search timing
        start = System.nanoTime();
        hashSet.contains(target);
        long hashSetTime = System.nanoTime() - start;

        // TreeSet search timing
        start = System.nanoTime();
        treeSet.contains(target);
        long treeSetTime = System.nanoTime() - start;

        // Display results
        System.out.println("Array Search Time (ms): " + arrayTime / 1_000_000.0);
        System.out.println("HashSet Search Time (ms): " + hashSetTime / 1_000_000.0);
        System.out.println("TreeSet Search Time (ms): " + treeSetTime / 1_000_000.0);

        sc.close();
    }
}

