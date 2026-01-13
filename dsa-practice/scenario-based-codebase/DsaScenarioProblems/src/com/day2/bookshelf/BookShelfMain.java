package com.day2.bookshelf;

import java.util.Scanner;

public class BookShelfMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\n====== BookShelf Menu ======");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Display Library");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();

                    library.addBook(genre, title, author);
                    break;

                case 2:
                    System.out.print("Enter genre: ");
                    genre = sc.nextLine();

                    System.out.print("Enter book title: ");
                    title = sc.nextLine();

                    library.borrowBook(genre, title);
                    break;

                case 3:
                    library.displayCatalog();
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

