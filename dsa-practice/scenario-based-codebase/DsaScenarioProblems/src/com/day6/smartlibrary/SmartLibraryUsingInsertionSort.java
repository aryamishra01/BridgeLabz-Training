package com.day6.smartlibrary;

import java.util.Scanner;

public class SmartLibraryUsingInsertionSort {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books borrowed: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Book[] borrowed = new Book[n];

        System.out.println("\nEnter book titles:");

        for (int i = 0; i < n; i++) {
            System.out.print("Book " + (i + 1) + ": ");
            String title = sc.nextLine();
            borrowed[i] = new Book(title);
        }

        System.out.println("\nBefore Sorting:");
        printBooks(borrowed);

        SmartLibrary.insertionSort(borrowed);

        System.out.println("\nAfter Auto-Sorting (Alphabetical Order):");
        printBooks(borrowed);

        sc.close();
    }

    static void printBooks(Book[] books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
