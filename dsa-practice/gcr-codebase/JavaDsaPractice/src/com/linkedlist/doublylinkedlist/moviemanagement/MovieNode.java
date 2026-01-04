package com.linkedlist.doublylinkedlist.moviemanagement;

//This class represents a movie record (node)
public class MovieNode {

	 String title;          // Movie title
	 String director;       // Director name
	 int releaseYear;       // Year of release
	 double rating;         // Movie rating
	
	 MovieNode next;        // Pointer to next node
	 MovieNode prev;        // Pointer to previous node
	
	 // Constructor to initialize movie details
	 public MovieNode(String title, String director,
	                  int releaseYear, double rating) {
	
	     this.title = title;
	     this.director = director;
	     this.releaseYear = releaseYear;
	     this.rating = rating;
	     this.next = null;
	     this.prev = null;
	 }
}

