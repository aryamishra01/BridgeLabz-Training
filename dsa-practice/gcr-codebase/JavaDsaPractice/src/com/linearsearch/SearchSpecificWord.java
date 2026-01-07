package com.linearsearch;

import java.util.Scanner;

public class SearchSpecificWord {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of sentences
        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] sentences = new String[n];

        // Take sentences input
        System.out.println("Enter the sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        // Take word to search
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        // Linear search
        String result = "Not Found";

        for (int i = 0; i < n; i++) {
            if (sentences[i].contains(word)) {
                result = sentences[i];
                break;
            }
        }

        // Print result
        System.out.println("Result: " + result);

        sc.close();
    }
}
