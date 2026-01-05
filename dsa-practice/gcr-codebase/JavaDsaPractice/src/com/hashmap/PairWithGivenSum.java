package com.hashmap;

import java.util.*;

public class PairWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        for (int num : arr) {
            int complement = target - num;

            if (map.containsKey(complement) && map.get(complement) > 0) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                found = true;
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        if (!found) {
            System.out.println("No pair found");
        }

        sc.close();
    }
}
