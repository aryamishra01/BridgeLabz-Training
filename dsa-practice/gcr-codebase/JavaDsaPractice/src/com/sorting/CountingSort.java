package com.sorting;

import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];

        System.out.println("Enter student ages (10 to 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        int min = 10, max = 18;
        int[] count = new int[max - min + 1];

        // Count frequency of each age
        for (int age : ages) {
            count[age - min]++;
        }

        System.out.println("Sorted Student Ages:");
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                System.out.print((i + min) + " ");
            }
        }
    }
}
