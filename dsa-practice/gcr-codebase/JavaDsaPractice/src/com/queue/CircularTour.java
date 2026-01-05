package com.queue;

import java.util.*;

public class CircularTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of petrol pumps: ");
        int n = sc.nextInt();

        int[] petrol = new int[n];
        int[] distance = new int[n];

        System.out.println("Enter petrol at each pump:");
        for (int i = 0; i < n; i++) {
            petrol[i] = sc.nextInt();
        }

        System.out.println("Enter distance to next pump:");
        for (int i = 0; i < n; i++) {
            distance[i] = sc.nextInt();
        }

        int start = 0;
        int currPetrol = 0;
        int totalPetrol = 0;

        for (int i = 0; i < n; i++) {
            int diff = petrol[i] - distance[i];
            currPetrol += diff;
            totalPetrol += diff;

            if (currPetrol < 0) {
                start = i + 1;
                currPetrol = 0;
            }
        }

        if (totalPetrol >= 0) {
            System.out.println("Start at petrol pump index: " + start);
        } else {
            System.out.println("No possible tour");
        }

        sc.close();
    }
}

