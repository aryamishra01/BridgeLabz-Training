package com.day4.swiftcart;

//Base Product Class
class Product {
	 protected String name;
	 protected double price;
	 protected String category;
	 protected int quantity;
	
	 Product(String name, double price, String category, int quantity) {
	     this.name = name;
	     this.price = price;
	     this.category = category;
	     this.quantity = quantity;
	 }
	
	 // Polymorphic method
	 double getDiscount() {
	     return 0;
	 }
	
	 double getTotalPrice() {
	     return price * quantity;
	 }
}

