package com.day4.swiftcart;

//Non-Perishable Product
class NonPerishableProduct extends Product {

	 NonPerishableProduct(String name, double price, int quantity) {
	     super(name, price, "Non-Perishable", quantity);
	 }
	
	 @Override
	 double getDiscount() {
	     return getTotalPrice() * 0.05; // 5% discount
	 }
}
