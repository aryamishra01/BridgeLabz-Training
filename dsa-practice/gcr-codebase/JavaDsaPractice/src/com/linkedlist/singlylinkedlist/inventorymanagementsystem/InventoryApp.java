package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

import java.util.Scanner;

//Main class to run Inventory Management System
public class InventoryApp {

	 public static void main(String[] args) {
	
	     Scanner sc = new Scanner(System.in);
	     InventoryList inventory = new InventoryList();
	     int choice;
	
	     do {
	         System.out.println("\nInventory Management Menu");
	         System.out.println("1. Add Item at Beginning");
	         System.out.println("2. Add Item at End");
	         System.out.println("3. Add Item at Position");
	         System.out.println("4. Remove Item");
	         System.out.println("5. Update Quantity");
	         System.out.println("6. Search Item");
	         System.out.println("7. Display Items");
	         System.out.println("8. Calculate Total Value");
	         System.out.println("9. Sort by Name (Ascending)");
	         System.out.println("10. Sort by Price (Descending)");
	         System.out.println("11. Exit");
	         System.out.print("Enter your choice: ");
	
	         choice = sc.nextInt();
	         sc.nextLine();
	
	         switch (choice) {
	
	             case 1:
	                 System.out.print("Item ID: ");
	                 int id1 = sc.nextInt();
	                 sc.nextLine();
	
	                 System.out.print("Item Name: ");
	                 String name1 = sc.nextLine();
	
	                 System.out.print("Quantity: ");
	                 int qty1 = sc.nextInt();
	
	                 System.out.print("Price: ");
	                 double price1 = sc.nextDouble();
	
	                 inventory.addAtBeginning(id1, name1, qty1, price1);
	                 break;
	
	             case 2:
	                 System.out.print("Item ID: ");
	                 int id2 = sc.nextInt();
	                 sc.nextLine();
	
	                 System.out.print("Item Name: ");
	                 String name2 = sc.nextLine();
	
	                 System.out.print("Quantity: ");
	                 int qty2 = sc.nextInt();
	
	                 System.out.print("Price: ");
	                 double price2 = sc.nextDouble();
	
	                 inventory.addAtEnd(id2, name2, qty2, price2);
	                 break;
	
	             case 3:
	                 System.out.print("Position: ");
	                 int pos = sc.nextInt();
	
	                 System.out.print("Item ID: ");
	                 int id3 = sc.nextInt();
	                 sc.nextLine();
	
	                 System.out.print("Item Name: ");
	                 String name3 = sc.nextLine();
	
	                 System.out.print("Quantity: ");
	                 int qty3 = sc.nextInt();
	
	                 System.out.print("Price: ");
	                 double price3 = sc.nextDouble();
	
	                 inventory.addAtPosition(pos, id3, name3, qty3, price3);
	                 break;
	
	             case 4:
	                 System.out.print("Enter Item ID to remove: ");
	                 inventory.removeItem(sc.nextInt());
	                 break;
	
	             case 5:
	                 System.out.print("Item ID: ");
	                 int uid = sc.nextInt();
	
	                 System.out.print("New Quantity: ");
	                 int newQty = sc.nextInt();
	
	                 inventory.updateQuantity(uid, newQty);
	                 break;
	
	             case 6:
	                 System.out.print("Enter Item ID or Name: ");
	                 inventory.searchItem(sc.nextLine());
	                 break;
	
	             case 7:
	                 inventory.displayItems();
	                 break;
	
	             case 8:
	                 inventory.calculateTotalValue();
	                 break;
	
	             case 9:
	                 inventory.sortByNameAscending();
	                 break;
	
	             case 10:
	                 inventory.sortByPriceDescending();
	                 break;
	
	             case 11:
	                 System.out.println("Exiting Inventory System");
	                 break;
	
	             default:
	                 System.out.println("Invalid choice");
	         }
	
	     } while (choice != 11);
	
	     sc.close();
	 }
}

