package com.encapsulation.problem2;

import java.util.ArrayList;
import java.util.List;

public class DemonstratePolymorphism {

	public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        // Creating objects
        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "T-Shirt", 1500));
        products.add(new Groceries(103, "Rice Bag", 1200));

        System.out.println("========= E-Commerce Billing Details =========");

        // Polymorphic processing
        for (Product p : products) {

            double tax = 0;

            // Check if product supports tax
            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
                System.out.println(((Taxable) p).getTaxDetails());
            } else {
                System.out.println("No tax applicable");
            }

            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Product ID    : " + p.getProductId());
            System.out.println("Product Name  : " + p.getName());
            System.out.println("Base Price    : ₹" + p.getPrice());
            System.out.println("Discount      : ₹" + discount);
            System.out.println("Tax Amount    : ₹" + tax);
            System.out.println("Final Price   : ₹" + finalPrice);
            System.out.println("--------------------------------------------");
        }
    }
}
