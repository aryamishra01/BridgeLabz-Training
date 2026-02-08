package com.librarymanagementsystem;

import java.util.Scanner;

//Main driver class
public class LibraryApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Get singleton catalog instance
     LibraryCatalog catalog = LibraryCatalog.getInstance();

     // User login
     System.out.print("Enter your role (student/faculty/librarian): ");
     String role = sc.nextLine();

     System.out.print("Enter your name: ");
     String name = sc.nextLine();

     // Factory creates user object
     User user = UserFactory.createUser(role, name);

     if (user == null) {
         System.out.println("Invalid role!");
         return;
     }

     user.role();

     // Subscribe user for notifications
     catalog.subscribe(user);

     // Book creation using Builder pattern
     System.out.print("\nEnter book title: ");
     String title = sc.nextLine();

     BookBuilder builder = new BookBuilder(title);

     System.out.print("Enter author (optional): ");
     String author = sc.nextLine();
     if (!author.isEmpty()) builder.setAuthor(author);

     System.out.print("Enter edition (optional): ");
     String edition = sc.nextLine();
     if (!edition.isEmpty()) builder.setEdition(edition);

     System.out.print("Enter genre (optional): ");
     String genre = sc.nextLine();
     if (!genre.isEmpty()) builder.setGenre(genre);

     System.out.print("Enter publisher (optional): ");
     String publisher = sc.nextLine();
     if (!publisher.isEmpty()) builder.setPublisher(publisher);

     Book book = builder.build();

     // Add book to catalog (observers notified automatically)
     catalog.addBook(book);

     System.out.println("\nCatalog Books:");
     catalog.showBooks();
 }
}

