package com.day6.bookbazar;

//Base Book class
public abstract class Book implements IDiscountable {

	 protected String title;
	 protected String author;
	 protected double price;
	
	 private int stock;   // inventory protected using encapsulation
	
	 // Constructor without offer
	 public Book(String title, String author, double price, int stock) {
	     this.title = title;
	     this.author = author;
	     this.price = price;
	     this.stock = stock;
	 }
	
	 // Constructor with offer price
	 public Book(String title, String author, double price, int stock, double offerPrice) {
	     this(title, author, offerPrice, stock);
	 }
	
	 // Encapsulated stock update
	 public boolean reduceStock(int quantity) {
	     if (quantity <= stock) {
	         stock -= quantity;
	         return true;
	     }
	     return false;
	 }
	
	 public int getStock() {
	     return stock;
	 }
	
	 public double getPrice() {
	     return price;
	 }
}

