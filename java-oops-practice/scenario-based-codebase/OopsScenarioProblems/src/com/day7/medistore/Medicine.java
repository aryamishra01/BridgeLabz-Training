package com.day7.medistore;

import java.time.LocalDate;

//Base class for all medicines
class Medicine implements ISellable {

	 // Encapsulation: sensitive data kept private
	 private String name;
	 private double price;
	 private LocalDate expiryDate;
	
	 // Protected so subclasses can access stock
	 protected int quantity;
	
	 // Constructor with default quantity
	 public Medicine(String name, double price, LocalDate expiryDate) {
	     this(name, price, expiryDate, 50); // default stock = 50
	 }
	
	 // Constructor with custom quantity
	 public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
	     this.name = name;
	     this.price = price;
	     this.expiryDate = expiryDate;
	     this.quantity = quantity;
	 }
	
	 // Private method for sensitive pricing logic
	 private double applyDiscount(double total) {
	     // 10% discount if bill > 500
	     if (total > 500) {
	         return total * 0.9;
	     }
	     return total;
	 }
	
	 // Sell medicine using operators
	 @Override
	 public double sell(int qty) {
	     if (qty > quantity) {
	         System.out.println("❌ Insufficient stock!");
	         return 0;
	     }
	
	     quantity -= qty;   // stock adjustment
	     double total = price * qty; // operator usage
	     return applyDiscount(total);
	 }
	
	 // General expiry check
	 @Override
	 public boolean checkExpiry() {
	     return expiryDate.isBefore(LocalDate.now());
	 }
	
	 // Getter for name
	 public String getName() {
	     return name;
	 }
}

