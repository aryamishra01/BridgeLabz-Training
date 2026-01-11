package com.day1.bookshelf;

import java.util.*;

import java.util.*;

class BookShelf {

    private Map<String, LinkedList<Book>> catalog = new HashMap<>();
    private Set<String> isbnSet = new HashSet<>();

    // Add Book
    public void addBook(String genre, Book book) {
        if (isbnSet.contains(book.getIsbn())) {
            System.out.println("Book already exists!");
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        isbnSet.add(book.getIsbn());

        System.out.println("Book added successfully");
    }

    // Borrow Book
    public void borrowBook(String genre, String isbn) {
        LinkedList<Book> books = catalog.get(genre);

        if (books == null || books.isEmpty()) {
            System.out.println("No books available in this genre");
            return;
        }

        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getIsbn().equals(isbn)) {
                iterator.remove();
                isbnSet.remove(isbn);
                System.out.println("Book borrowed successfully");
                return;
            }
        }

        System.out.println("Book not found");
    }

    // Display Catalog
    public void displayCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("Library is empty");
            return;
        }

        System.out.println("\nLibrary Catalog:");
        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println("  - " + book);
            }
        }
    }
}

