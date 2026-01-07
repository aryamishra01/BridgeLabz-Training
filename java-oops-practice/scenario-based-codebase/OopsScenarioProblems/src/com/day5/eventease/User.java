package com.day5.eventease;

import java.util.Scanner;

//User class represents the event organizer
public class User {

	 private String name;        // sensitive data
	 private String email;       // sensitive data
	 private String phone;
	
	 // Constructor
	 public User(String name, String email, String phone) {
	     this.name = name;
	     this.email = email;
	     this.phone = phone;
	 }
	
	 // Getter methods only (no setters for security)
	 public String getName() {
	     return name;
	 }
	
	 public String getEmail() {
	     return email;
	 }
}

