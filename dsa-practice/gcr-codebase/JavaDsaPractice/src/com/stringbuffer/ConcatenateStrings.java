package com.stringbuffer;

import java.util.Scanner;

public class ConcatenateStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Create array to store strings
        String[] arr = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer();

        // Append each string to StringBuffer
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        // Convert StringBuffer to String
        String result = sb.toString();

        // Print concatenated string
        System.out.println("Concatenated string: " + result);

        sc.close();
    }
}

