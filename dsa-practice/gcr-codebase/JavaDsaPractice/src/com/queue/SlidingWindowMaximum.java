package com.queue;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // Remove elements out of current window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements (not useful)
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // Print max once window is complete
            if (i >= k - 1) {
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }

        sc.close();
    }
}

