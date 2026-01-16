package com.day4.smartshelf;

import java.util.Scanner;

public class SmartShelfUsingInsertionSort {

	// Method to insert a new book into sorted list using insertion sort logic
    static void insertBook(Book[] books, int count) {

        // The last added book is taken as key
        Book key = books[count - 1];
        int j = count - 2;

        // Shift books that are alphabetically greater than key to one position ahead
        while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
            books[j + 1] = books[j];
            j--;
        }

        // Place key book at correct position
        books[j + 1] = key;
    }

    // Method to display current reading list
    static void displayBooks(Book[] books, int count) {
        System.out.println("Current Reading List");

        for (int i = 0; i < count; i++) {
            System.out.println(books[i].title);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of books to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];
        int count = 0;

        // Adding books one by one and keeping list sorted
        for (int i = 0; i < n; i++) {

            System.out.print("Enter book title: ");
            String title = sc.nextLine();

            books[count] = new Book(title);
            count++;

            // Maintain sorted order after each insertion
            insertBook(books, count);

            // Display list after each insertion to show real time sorting
            System.out.println("\nList after adding this book");
            displayBooks(books, count);
            System.out.println();
        }

        sc.close();
    }
}
