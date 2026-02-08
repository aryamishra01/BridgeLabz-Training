package com.librarymanagementsystem;

//Factory pattern to create users dynamically
public class UserFactory {

	 public static User createUser(String type, String name) {
	
	     if (type.equalsIgnoreCase("student"))
	         return new Student(name);
	
	     if (type.equalsIgnoreCase("faculty"))
	         return new Faculty(name);
	
	     if (type.equalsIgnoreCase("librarian"))
	         return new Librarian(name);
	
	     return null;
	 }
}

