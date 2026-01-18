package com.generics.dynamiconlinemarketplace;

import java.util.List;
import java.util.Scanner;

public class OnlineMarketplaceApp {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        ProductCatalog catalog = new ProductCatalog();

	        int choice;

	        do {
	            System.out.println("1. Add Book");
	            System.out.println("2. Add Clothing");
	            System.out.println("3. Add Gadget");
	            System.out.println("4. Apply Discount");
	            System.out.println("5. Display Catalog");
	            System.out.println("0. Exit");
	            System.out.print("Enter choice: ");

	            choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {

	                case 1: {
	                    System.out.print("Enter Book Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter Price: ");
	                    double price = sc.nextDouble();

	                    Product<BookCategory> book =
	                            new Product<>(name, price, new BookCategory());
	                    catalog.addProduct(book);
	                    break;
	                }

	                case 2: {
	                    System.out.print("Enter Clothing Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter Price: ");
	                    double price = sc.nextDouble();

	                    Product<ClothingCategory> clothing =
	                            new Product<>(name, price, new ClothingCategory());
	                    catalog.addProduct(clothing);
	                    break;
	                }

	                case 3: {
	                    System.out.print("Enter Gadget Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter Price: ");
	                    double price = sc.nextDouble();

	                    Product<GadgetCategory> gadget =
	                            new Product<>(name, price, new GadgetCategory());
	                    catalog.addProduct(gadget);
	                    break;
	                }

	                case 4: {
	                    System.out.println("Discount applied to all products");
	                    System.out.print("Enter discount percentage: ");
	                    double percent = sc.nextDouble();
	                    for (Product<? extends Category> p : catalog.getProducts()){
	                        DiscountUtil.applyDiscount(p, percent);
	                    }
	                    break;
	                }

	                case 5:
	                	List<Product<? extends Category>> list = catalog.getProducts();
	                	for (Product<? extends Category> product : list) {
	                	    System.out.println(product); 
	                	}
	                    break;

	                case 0:
	                    System.out.println("Exiting Marketplace...");
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	            }

	        } while (choice != 0);

	        sc.close();
	    }
}
