package com.linkedlist.doublylinkedlist.moviemanagement;

//This class manages movie records using a doubly linked list
public class MovieDoublyLinkedList {

	 private MovieNode head;
	 private MovieNode tail;
	
	 // Constructor
	 public MovieDoublyLinkedList() {
	     head = null;
	     tail = null;
	 }
	
	 // Add movie at beginning
	 public void addAtBeginning(String title, String director,
	                            int year, double rating) {
	
	     MovieNode newNode =
	             new MovieNode(title, director, year, rating);
	
	     if (head == null) {
	         head = tail = newNode;
	     } else {
	         newNode.next = head;
	         head.prev = newNode;
	         head = newNode;
	     }
	
	     System.out.println("Movie added at beginning");
	 }
	
	 // Add movie at end
	 public void addAtEnd(String title, String director,
	                      int year, double rating) {
	
	     MovieNode newNode =
	             new MovieNode(title, director, year, rating);
	
	     if (tail == null) {
	         head = tail = newNode;
	     } else {
	         tail.next = newNode;
	         newNode.prev = tail;
	         tail = newNode;
	     }
	
	     System.out.println("Movie added at end");
	 }
	
	 // Add movie at specific position (1-based index)
	 public void addAtPosition(int position, String title,
	                           String director, int year,
	                           double rating) {
	
	     if (position <= 1) {
	         addAtBeginning(title, director, year, rating);
	         return;
	     }
	
	     MovieNode temp = head;
	     int count = 1;
	
	     while (temp != null && count < position - 1) {
	         temp = temp.next;
	         count++;
	     }
	
	     if (temp == null || temp.next == null) {
	         addAtEnd(title, director, year, rating);
	         return;
	     }
	
	     MovieNode newNode =
	             new MovieNode(title, director, year, rating);
	
	     newNode.next = temp.next;
	     newNode.prev = temp;
	     temp.next.prev = newNode;
	     temp.next = newNode;
	
	     System.out.println("Movie added at position " + position);
	 }
	
	 // Remove movie by title
	 public void removeByTitle(String title) {
	
	     if (head == null) {
	         System.out.println("No movie records available");
	         return;
	     }
	
	     MovieNode temp = head;
	
	     while (temp != null &&
	            !temp.title.equalsIgnoreCase(title)) {
	         temp = temp.next;
	     }
	
	     if (temp == null) {
	         System.out.println("Movie not found");
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
	
	     System.out.println("Movie removed successfully");
	 }
	
	 // Search movie by director or rating
	 public void searchMovie(String director, double rating) {
	
	     MovieNode temp = head;
	     boolean found = false;
	
	     while (temp != null) {
	         if (temp.director.equalsIgnoreCase(director) ||
	             temp.rating == rating) {
	
	             displayMovie(temp);
	             found = true;
	         }
	         temp = temp.next;
	     }
	
	     if (!found) {
	         System.out.println("No matching movie found");
	     }
	 }
	
	 // Update movie rating by title
	 public void updateRating(String title, double newRating) {
	
	     MovieNode temp = head;
	
	     while (temp != null) {
	         if (temp.title.equalsIgnoreCase(title)) {
	             temp.rating = newRating;
	             System.out.println("Movie rating updated");
	             return;
	         }
	         temp = temp.next;
	     }
	
	     System.out.println("Movie not found");
	 }
	
	 // Display movies in forward order
	 public void displayForward() {
	
	     if (head == null) {
	         System.out.println("No movie records available");
	         return;
	     }
	
	     MovieNode temp = head;
	
	     System.out.println("\nMovies (Forward Order):");
	     while (temp != null) {
	         displayMovie(temp);
	         temp = temp.next;
	     }
	 }
	
	 // Display movies in reverse order
	 public void displayReverse() {
	
	     if (tail == null) {
	         System.out.println("No movie records available");
	         return;
	     }
	
	     MovieNode temp = tail;
	
	     System.out.println("\nMovies (Reverse Order):");
	     while (temp != null) {
	         displayMovie(temp);
	         temp = temp.prev;
	     }
	 }
	
	 // Helper method to display one movie
	 private void displayMovie(MovieNode movie) {
	
	     System.out.println("Title: " + movie.title);
	     System.out.println("Director: " + movie.director);
	     System.out.println("Release Year: " + movie.releaseYear);
	     System.out.println("Rating: " + movie.rating);
	     System.out.println("----------------------");
	 }
}

