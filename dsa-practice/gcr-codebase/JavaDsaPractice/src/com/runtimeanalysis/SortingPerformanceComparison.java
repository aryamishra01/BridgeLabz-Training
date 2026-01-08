package com.runtimeanalysis;

import java.util.*;

class SortingPerformanceComparison {

    // Bubble Sort: repeatedly swaps adjacent elements
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort: divide array and merge sorted halves
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }

    // Quick Sort: partition-based sorting
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dataset size
        System.out.print("Enter dataset size: ");
        int n = sc.nextInt();

        int[] original = new int[n];
        Random rand = new Random();

        // Generate random data
        for (int i = 0; i < n; i++) {
            original[i] = rand.nextInt(n);
        }

        // Bubble Sort timing (skip for very large input)
        if (n <= 10000) {
            int[] bubbleArr = original.clone();
            long start = System.nanoTime();
            bubbleSort(bubbleArr);
            long bubbleTime = System.nanoTime() - start;
            System.out.println("Bubble Sort Time (ms): " + bubbleTime / 1_000_000.0);
        } else {
            System.out.println("Bubble Sort Time: Unfeasible for large dataset");
        }

        // Merge Sort timing
        int[] mergeArr = original.clone();
        long start = System.nanoTime();
        mergeSort(mergeArr, 0, mergeArr.length - 1);
        long mergeTime = System.nanoTime() - start;
        System.out.println("Merge Sort Time (ms): " + mergeTime / 1_000_000.0);

        // Quick Sort timing
        int[] quickArr = original.clone();
        start = System.nanoTime();
        quickSort(quickArr, 0, quickArr.length - 1);
        long quickTime = System.nanoTime() - start;
        System.out.println("Quick Sort Time (ms): " + quickTime / 1_000_000.0);

        sc.close();
    }
}

