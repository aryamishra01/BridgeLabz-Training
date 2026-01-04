package com.linkedlist.doublylinkedlist.librarymanagementsystem;

import java.util.Scanner;

//Main class to run Library Management System
public class LibraryApp {

	 public static void main(String[] args) {
	
	     Scanner sc = new Scanner(System.in);
	     LibraryDoublyLinkedList library =
	             new LibraryDoublyLinkedList();
	
	     int choice;
	
	     do {
	         System.out.println("\nLibrary Menu");
	         System.out.println("1. Add Book at Beginning");
	         System.out.println("2. Add Book at End");
	         System.out.println("3. Add Book at Position");
	         System.out.println("4. Remove Book by ID");
	         System.out.println("5. Search Book");
	         System.out.println("6. Update Availability");
	         System.out.println("7. Display Books Forward");
	         System.out.println("8. Display Books Reverse");
	         System.out.println("9. Count Books");
	         System.out.println("10. Exit");
	         System.out.print("Enter your choice: ");
	
	         choice = sc.nextInt();
	         sc.nextLine();
	
	         switch (choice) {
	
	             case 1:
	             case 2:
	             case 3:
	                 if (choice == 3) {
	                     System.out.print("Position: ");
	                     int pos = sc.nextInt();
	                     sc.nextLine();
	                     addBook(sc, library, choice, pos);
	                 } else {
	                     addBook(sc, library, choice, 0);
	                 }
	                 break;
	
	             case 4:
	                 System.out.print("Enter Book ID: ");
	                 library.removeById(sc.nextInt());
	                 break;
	
	             case 5:
	                 System.out.print("Enter Title or Author: ");
	                 library.searchBook(sc.nextLine());
	                 break;
	
	             case 6:
	                 System.out.print("Book ID: ");
	                 int id = sc.nextInt();
	                 System.out.print("Available (true/false): ");
	                 boolean status = sc.nextBoolean();
	                 library.updateAvailability(id, status);
	                 break;
	
	             case 7:
	                 library.displayForward();
	                 break;
	
	             case 8:
	                 library.displayReverse();
	                 break;
	
	             case 9:
	                 library.countBooks();
	                 break;
	
	             case 10:
	                 System.out.println("Exiting Library System");
	                 break;
	
	             default:
	                 System.out.println("Invalid choice");
	         }
	
	     } while (choice != 10);
	
	     sc.close();
	 }
	
	 // Helper method to take book input
	 private static void addBook(Scanner sc,
	                             LibraryDoublyLinkedList library,
	                             int choice, int position) {
	
	     System.out.print("Book ID: ");
	     int id = sc.nextInt();
	     sc.nextLine();
	
	     System.out.print("Title: ");
	     String title = sc.nextLine();
	
	     System.out.print("Author: ");
	     String author = sc.nextLine();
	
	     System.out.print("Genre: ");
	     String genre = sc.nextLine();
	
	     System.out.print("Available (true/false): ");
	     boolean status = sc.nextBoolean();
	
	     if (choice == 1) {
	         library.addAtBeginning(id, title, author, genre, status);
	     } else if (choice == 2) {
	         library.addAtEnd(id, title, author, genre, status);
	     } else {
	         library.addAtPosition(position, id, title, author, genre, status);
	     }
	 }
}

