package com.day1.bookshelf;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookShelf shelf = new BookShelf();
        int choice;

        do {
            System.out.println("\n====== Library Menu ======");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Display Catalog");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    shelf.addBook(genre, new Book(isbn, title, author));
                    break;

                case 2:
                    System.out.print("Enter Genre: ");
                    genre = sc.nextLine();

                    System.out.print("Enter ISBN to borrow: ");
                    isbn = sc.nextLine();

                    shelf.borrowBook(genre, isbn);
                    break;

                case 3:
                    shelf.displayCatalog();
                    break;

                case 4:
                    System.out.println("Exiting Library System");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}


