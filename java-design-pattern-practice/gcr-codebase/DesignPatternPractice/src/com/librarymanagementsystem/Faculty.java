package com.librarymanagementsystem;

//Faculty user type
public class Faculty extends User {

	 public Faculty(String name) {
	     super(name);
	 }
	
	 public void role() {
	     System.out.println(name + " is Faculty (extended borrowing)");
	 }
}

