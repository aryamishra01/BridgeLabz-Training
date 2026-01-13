package com.day2.bookshelf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

class Library {

    // genre → list of books
    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

    // to avoid duplicate books (title+author)
    private HashSet<String> uniqueBooks = new HashSet<>();

    // Add book
    public void addBook(String genre, String title, String author) {

        String key = title.toLowerCase() + author.toLowerCase();

        if (uniqueBooks.contains(key)) {
            System.out.println("Book already exists");
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(new Book(title, author));
        uniqueBooks.add(key);

        System.out.println("Book added successfully");
    }

    // Borrow (remove) book
    public void borrowBook(String genre, String title) {

        LinkedList<Book> books = catalog.get(genre);

        if (books == null || books.isEmpty()) {
            System.out.println("No books available in this genre");
            return;
        }

        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                books.remove(b);
                uniqueBooks.remove(b.title.toLowerCase() + b.author.toLowerCase());
                System.out.println("📕 Book borrowed successfully");
                return;
            }
        }

        System.out.println("Book not found");
    }

    // Display catalog
    public void displayCatalog() {

        if (catalog.isEmpty()) {
            System.out.println("Library is empty");
            return;
        }

        System.out.println("\nLibrary Catalog:");
        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println("  - " + b);
            }
        }
    }
}
