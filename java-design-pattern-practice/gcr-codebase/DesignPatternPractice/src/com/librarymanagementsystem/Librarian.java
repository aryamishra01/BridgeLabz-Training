package com.librarymanagementsystem;

//Librarian user type
public class Librarian extends User {

	 public Librarian(String name) {
	     super(name);
	 }
	
	 public void role() {
	     System.out.println(name + " is Librarian (manages inventory)");
	 }
}

