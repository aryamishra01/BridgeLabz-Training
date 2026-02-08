package com.librarymanagementsystem;

import java.util.*;

//Singleton class ensures only one catalog exists
public class LibraryCatalog implements Subject {

	 private static LibraryCatalog instance = new LibraryCatalog();
	
	 private List<Book> books = new ArrayList<>();
	 private List<Observer> observers = new ArrayList<>();
	
	 // Private constructor prevents object creation from outside
	 private LibraryCatalog() {}
	
	 // Global access point to single instance
	 public static LibraryCatalog getInstance() {
	     return instance;
	 }
	
	 // Add book and notify all subscribed users
	 public void addBook(Book book) {
	     books.add(book);
	     notifyObservers("New book added: " + book.getTitle());
	 }
	
	 // Display all books
	 public void showBooks() {
	     books.forEach(System.out::println);
	 }
	
	 public void subscribe(Observer o) {
	     observers.add(o);
	 }
	
	 public void unsubscribe(Observer o) {
	     observers.remove(o);
	 }
	
	 // Notify all observers
	 public void notifyObservers(String message) {
	     observers.forEach(o -> o.update(message));
	 }
}

