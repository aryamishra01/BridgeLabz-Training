package com.librarymanagementsystem;

//Abstract user class implementing Observer
public abstract class User implements Observer {

	 protected String name;
	
	 public User(String name) {
	     this.name = name;
	 }
	
	 // Notification received
	 public void update(String message) {
	     System.out.println(name + " received notification: " + message);
	 }
	
	 // Each user type defines its role
	 public abstract void role();
}
