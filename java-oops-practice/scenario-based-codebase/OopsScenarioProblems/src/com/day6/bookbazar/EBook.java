package com.day6.bookbazar;

//EBook class
public class EBook extends Book {

	 public EBook(String title, String author, double price, int stock) {
	     super(title, author, price, stock);
	 }
	
	 // Discount logic for eBooks
	 @Override
	 public double applyDiscount(int quantity) {
	     double total = price * quantity;
	     return total * 0.90; // 10% discount
	 }
}

