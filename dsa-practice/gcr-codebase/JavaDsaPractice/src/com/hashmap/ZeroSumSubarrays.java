package com.hashmap;

import java.util.*;

public class ZeroSumSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        boolean found = false;

        // To handle subarrays starting from index 0
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println(
                        "Zero-sum subarray found from index " + (start + 1) + " to " + i
                    );
                    found = true;
                }
            }

            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }

        if (!found) {
            System.out.println("No zero-sum subarray found");
        }

        sc.close();
    }
}
