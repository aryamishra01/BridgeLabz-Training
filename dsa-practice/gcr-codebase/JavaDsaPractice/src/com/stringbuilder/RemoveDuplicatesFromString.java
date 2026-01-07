package com.stringbuilder;

import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // StringBuilder to store result without duplicates
        StringBuilder result = new StringBuilder();

        // HashSet to track already seen characters
        HashSet<Character> seen = new HashSet<>();

        // Iterate through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If character is not already seen
            if (!seen.contains(ch)) {
                result.append(ch);   // append to StringBuilder
                seen.add(ch);        // add to HashSet
            }
        }

        // Convert StringBuilder to String
        String output = result.toString();

        // Print result
        System.out.println("String after removing duplicates: " + output);

        sc.close();
    }
}
