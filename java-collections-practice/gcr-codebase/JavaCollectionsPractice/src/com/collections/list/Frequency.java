package com.collections.list;

import java.util.*;

public class Frequency {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<String> list = new ArrayList<>();

        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        Map<String, Integer> freq = new HashMap<>();

        for (String s : list) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        System.out.println("Frequencies: " + freq);
    }
}
