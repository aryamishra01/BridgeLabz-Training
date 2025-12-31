package com.objectmodeling.assistedproblems.problem1;

public class DemonstrateAggregation {

	    public static void main(String[] args) {

	        // Book objects exist independently
	        Book book1 = new Book("Java Basics", "James Gosling");
	        Book book2 = new Book("Clean Code", "Robert Martin");
	        Book book3 = new Book("Effective Java", "Joshua Bloch");

	        // Library objects
	        Library lib1 = new Library("City Library");
	        Library lib2 = new Library("College Library");

	        // Adding books to libraries
	        lib1.addBook(book1);
	        lib1.addBook(book2);

	        lib2.addBook(book2);   // same book used in another library
	        lib2.addBook(book3);

	        // Display books
	        lib1.showBooks();
	        lib2.showBooks();
	    }
}


