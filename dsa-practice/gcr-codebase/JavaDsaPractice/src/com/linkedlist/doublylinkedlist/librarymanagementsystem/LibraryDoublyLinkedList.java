package com.linkedlist.doublylinkedlist.librarymanagementsystem;

//This class manages the library using a doubly linked list
public class LibraryDoublyLinkedList {

	 private BookNode head;
	 private BookNode tail;
	
	 // Constructor
	 public LibraryDoublyLinkedList() {
	     head = null;
	     tail = null;
	 }
	
	 // Add book at beginning
	 public void addAtBeginning(int id, String title,
	                            String author, String genre,
	                            boolean status) {
	
	     BookNode newNode =
	             new BookNode(id, title, author, genre, status);
	
	     if (head == null) {
	         head = tail = newNode;
	     } else {
	         newNode.next = head;
	         head.prev = newNode;
	         head = newNode;
	     }
	
	     System.out.println("Book added at beginning");
	 }
	
	 // Add book at end
	 public void addAtEnd(int id, String title,
	                      String author, String genre,
	                      boolean status) {
	
	     BookNode newNode =
	             new BookNode(id, title, author, genre, status);
	
	     if (tail == null) {
	         head = tail = newNode;
	     } else {
	         tail.next = newNode;
	         newNode.prev = tail;
	         tail = newNode;
	     }
	
	     System.out.println("Book added at end");
	 }
	
	 // Add book at specific position (1-based index)
	 public void addAtPosition(int position, int id,
	                           String title, String author,
	                           String genre, boolean status) {
	
	     if (position <= 1) {
	         addAtBeginning(id, title, author, genre, status);
	         return;
	     }
	
	     BookNode temp = head;
	     int count = 1;
	
	     while (temp != null && count < position - 1) {
	         temp = temp.next;
	         count++;
	     }
	
	     if (temp == null || temp.next == null) {
	         addAtEnd(id, title, author, genre, status);
	         return;
	     }
	
	     BookNode newNode =
	             new BookNode(id, title, author, genre, status);
	
	     newNode.next = temp.next;
	     newNode.prev = temp;
	     temp.next.prev = newNode;
	     temp.next = newNode;
	
	     System.out.println("Book added at position " + position);
	 }
	
	 // Remove book by Book ID
	 public void removeById(int id) {
	
	     if (head == null) {
	         System.out.println("Library is empty");
	         return;
	     }
	
	     BookNode temp = head;
	
	     while (temp != null && temp.bookId != id) {
	         temp = temp.next;
	     }
	
	     if (temp == null) {
	         System.out.println("Book not found");
	         return;
	     }
	
	     if (temp == head) {
	         head = head.next;
	         if (head != null) {
	             head.prev = null;
	         }
	     } else if (temp == tail) {
	         tail = tail.prev;
	         tail.next = null;
	     } else {
	         temp.prev.next = temp.next;
	         temp.next.prev = temp.prev;
	     }
	
	     System.out.println("Book removed successfully");
	 }
	
	 // Search book by title or author
	 public void searchBook(String keyword) {
	
	     BookNode temp = head;
	     boolean found = false;
	
	     while (temp != null) {
	         if (temp.title.equalsIgnoreCase(keyword) ||
	             temp.author.equalsIgnoreCase(keyword)) {
	
	             displayBook(temp);
	             found = true;
	         }
	         temp = temp.next;
	     }
	
	     if (!found) {
	         System.out.println("No matching book found");
	     }
	 }
	
	 // Update availability status
	 public void updateAvailability(int id, boolean status) {
	
	     BookNode temp = head;
	
	     while (temp != null) {
	         if (temp.bookId == id) {
	             temp.isAvailable = status;
	             System.out.println("Availability updated");
	             return;
	         }
	         temp = temp.next;
	     }
	
	     System.out.println("Book not found");
	 }
	
	 // Display books in forward order
	 public void displayForward() {
	
	     if (head == null) {
	         System.out.println("Library is empty");
	         return;
	     }
	
	     BookNode temp = head;
	
	     System.out.println("\nBooks (Forward Order):");
	     while (temp != null) {
	         displayBook(temp);
	         temp = temp.next;
	     }
	 }
	
	 // Display books in reverse order
	 public void displayReverse() {
	
	     if (tail == null) {
	         System.out.println("Library is empty");
	         return;
	     }
	
	     BookNode temp = tail;
	
	     System.out.println("\nBooks (Reverse Order):");
	     while (temp != null) {
	         displayBook(temp);
	         temp = temp.prev;
	     }
	 }
	
	 // Count total books
	 public void countBooks() {
	
	     int count = 0;
	     BookNode temp = head;
	
	     while (temp != null) {
	         count++;
	         temp = temp.next;
	     }
	
	     System.out.println("Total number of books: " + count);
	 }
	
	 // Helper method to display a single book
	 private void displayBook(BookNode book) {
	
	     System.out.println("Book ID: " + book.bookId);
	     System.out.println("Title: " + book.title);
	     System.out.println("Author: " + book.author);
	     System.out.println("Genre: " + book.genre);
	     System.out.println("Available: " + book.isAvailable);
	     System.out.println("----------------------");
	 }
}

