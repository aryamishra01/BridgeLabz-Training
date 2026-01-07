package com.day6.bookbazar;

//Printed book class
public class PrintedBook extends Book {

	 public PrintedBook(String title, String author, double price, int stock) {
	     super(title, author, price, stock);
	 }
	
	 // Discount logic for printed books
	 @Override
	 public double applyDiscount(int quantity) {
	     double total = price * quantity;
	     if (quantity >= 3) {
	         total -= 100; // flat ₹100 discount
	     }
	     return total;
	 }
}

