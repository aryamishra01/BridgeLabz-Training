package com.linkedlist.doublylinkedlist.librarymanagementsystem;

//This class represents a single book in the library
public class BookNode {

	 int bookId;                 // Unique book ID
	 String title;               // Book title
	 String author;              // Author name
	 String genre;               // Book genre
	 boolean isAvailable;        // Availability status
	
	 BookNode next;              // Pointer to next node
	 BookNode prev;              // Pointer to previous node
	
	 // Constructor to initialize book details
	 public BookNode(int bookId, String title,
	                 String author, String genre,
	                 boolean isAvailable) {
	
	     this.bookId = bookId;
	     this.title = title;
	     this.author = author;
	     this.genre = genre;
	     this.isAvailable = isAvailable;
	     this.next = null;
	     this.prev = null;
	 }
}
