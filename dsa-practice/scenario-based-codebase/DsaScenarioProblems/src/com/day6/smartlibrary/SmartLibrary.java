package com.day6.smartlibrary;

public class SmartLibrary {

    // Insertion Sort by book title (alphabetical)
    public static void insertionSort(Book[] books) {

        for (int i = 1; i < books.length; i++) {

            Book newBook = books[i];
            int j = i - 1;

            // shift books that come after alphabetically
            while (j >= 0 && books[j].title.compareToIgnoreCase(newBook.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            // insert at correct position
            books[j + 1] = newBook;
        }
    }
}

