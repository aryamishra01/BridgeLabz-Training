package com.day4.swiftcart;

import java.util.ArrayList;
import java.util.List;

//Cart Class
class Cart implements ICheckout {
	 private List<Product> products = new ArrayList<>();
	 private double totalPrice;
	
	 Cart() {
	 }
	
	 Cart(List<Product> products) {
	     this.products = products;
	     calculateTotal();
	 }
	
	 void addProduct(Product p) {
	     products.add(p);
	     calculateTotal();
	 }
	
	 // Encapsulation
	 private void calculateTotal() {
	     totalPrice = 0;
	     for (Product p : products) {
	         totalPrice += p.getTotalPrice();
	     }
	 }
	
	 @Override
	 public void applyDiscount() {
	     double discount = 0;
	     for (Product p : products) {
	         discount += p.getDiscount();
	     }
	     totalPrice = totalPrice - discount;
	     System.out.println("Discount Applied: ₹" + discount);
	 }
	
	 @Override
	 public void generateBill() {
	     System.out.println("\n----- SwiftCart Bill -----");
	     for (Product p : products) {
	         System.out.println(p.name + " | Qty: " + p.quantity +
	                 " | Price: ₹" + p.getTotalPrice());
	     }
	     System.out.println("Final Amount: ₹" + totalPrice);
	 }
}

