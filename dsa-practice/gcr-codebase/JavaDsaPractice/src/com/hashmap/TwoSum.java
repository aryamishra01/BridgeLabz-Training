package com.hashmap;

import java.util.*;

public class TwoSum {
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

        for (int i = 0; i < n; i++) {

            // directly using target - current number
            if (map.containsKey(target - arr[i])) {
                System.out.println(
                    "Indices: " + map.get(target - arr[i]) + " and " + i
                );
                sc.close();
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No two sum solution found");
        sc.close();
    }
}

