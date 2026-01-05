package com.day4.swiftcart;

import java.util.Scanner;

//Main Class
public class SwiftCartApp {
	 public static void main(String[] args) {
	
	     Scanner sc = new Scanner(System.in);
	     Cart cart = new Cart();
	
	     System.out.print("Enter number of products: ");
	     int n = sc.nextInt();
	
	     for (int i = 1; i <= n; i++) {
	         sc.nextLine();
	
	         System.out.println("\nProduct " + i);
	         System.out.print("Enter name: ");
	         String name = sc.nextLine();
	
	         System.out.print("Enter price: ");
	         double price = sc.nextDouble();
	
	         System.out.print("Enter quantity: ");
	         int qty = sc.nextInt();
	
	         System.out.print("Type (1-Perishable, 2-NonPerishable): ");
	         int type = sc.nextInt();
	
	         if (type == 1) {
	             cart.addProduct(new PerishableProduct(name, price, qty));
	         } else {
	             cart.addProduct(new NonPerishableProduct(name, price, qty));
	         }
	     }
	
	     cart.applyDiscount();
	     cart.generateBill();
	
	     sc.close();
	 }
}
