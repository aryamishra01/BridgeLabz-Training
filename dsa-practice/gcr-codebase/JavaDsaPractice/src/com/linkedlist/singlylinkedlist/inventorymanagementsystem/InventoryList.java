package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

//This class contains all inventory operations using singly linked list
public class InventoryList {

	 private ItemNode head;
	
	 // Constructor
	 public InventoryList() {
	     head = null;
	 }
	
	 // Add item at beginning
	 public void addAtBeginning(int id, String name, int qty, double price) {
	
	     ItemNode newItem = new ItemNode(id, name, qty, price);
	     newItem.next = head;
	     head = newItem;
	
	     System.out.println("Item added at beginning");
	 }
	
	 // Add item at end
	 public void addAtEnd(int id, String name, int qty, double price) {
	
	     ItemNode newItem = new ItemNode(id, name, qty, price);
	
	     if (head == null) {
	         head = newItem;
	         return;
	     }
	
	     ItemNode temp = head;
	     while (temp.next != null) {
	         temp = temp.next;
	     }
	
	     temp.next = newItem;
	     System.out.println("Item added at end");
	 }
	
	 // Add item at specific position (1-based index)
	 public void addAtPosition(int position, int id, String name,
	                           int qty, double price) {
	
	     if (position <= 1) {
	         addAtBeginning(id, name, qty, price);
	         return;
	     }
	
	     ItemNode newItem = new ItemNode(id, name, qty, price);
	     ItemNode temp = head;
	     int count = 1;
	
	     while (temp != null && count < position - 1) {
	         temp = temp.next;
	         count++;
	     }
	
	     if (temp == null) {
	         System.out.println("Invalid position");
	         return;
	     }
	
	     newItem.next = temp.next;
	     temp.next = newItem;
	
	     System.out.println("Item added at position " + position);
	 }
	
	 // Remove item by Item ID
	 public void removeItem(int id) {
	
	     if (head == null) {
	         System.out.println("Inventory is empty");
	         return;
	     }
	
	     if (head.itemId == id) {
	         head = head.next;
	         System.out.println("Item removed successfully");
	         return;
	     }
	
	     ItemNode temp = head;
	
	     while (temp.next != null && temp.next.itemId != id) {
	         temp = temp.next;
	     }
	
	     if (temp.next == null) {
	         System.out.println("Item ID not found");
	     } else {
	         temp.next = temp.next.next;
	         System.out.println("Item removed successfully");
	     }
	 }
	
	 // Update quantity by Item ID
	 public void updateQuantity(int id, int newQty) {
	
	     ItemNode temp = head;
	
	     while (temp != null) {
	         if (temp.itemId == id) {
	             temp.quantity = newQty;
	             System.out.println("Quantity updated successfully");
	             return;
	         }
	         temp = temp.next;
	     }
	
	     System.out.println("Item ID not found");
	 }
	
	 // Search item by ID or Name
	 public void searchItem(String key) {
	
	     ItemNode temp = head;
	     boolean found = false;
	
	     while (temp != null) {
	         if (String.valueOf(temp.itemId).equals(key) ||
	             temp.itemName.equalsIgnoreCase(key)) {
	
	             System.out.println("Item ID: " + temp.itemId);
	             System.out.println("Item Name: " + temp.itemName);
	             System.out.println("Quantity: " + temp.quantity);
	             System.out.println("Price: " + temp.price);
	             System.out.println("--------------------");
	             found = true;
	         }
	         temp = temp.next;
	     }
	
	     if (!found) {
	         System.out.println("Item not found");
	     }
	 }
	
	 // Display all items
	 public void displayItems() {
	
	     if (head == null) {
	         System.out.println("Inventory is empty");
	         return;
	     }
	
	     ItemNode temp = head;
	
	     System.out.println("\nInventory List:");
	     while (temp != null) {
	         System.out.println("Item ID: " + temp.itemId);
	         System.out.println("Item Name: " + temp.itemName);
	         System.out.println("Quantity: " + temp.quantity);
	         System.out.println("Price: " + temp.price);
	         System.out.println("--------------------");
	         temp = temp.next;
	     }
	 }
	
	 // Calculate total inventory value
	 public void calculateTotalValue() {
	
	     double totalValue = 0;
	     ItemNode temp = head;
	
	     while (temp != null) {
	         totalValue += temp.quantity * temp.price;
	         temp = temp.next;
	     }
	
	     System.out.println("Total Inventory Value: " + totalValue);
	 }
	
	 // Sort inventory by item name (ascending)
	 public void sortByNameAscending() {
	
	     if (head == null) {
	         return;
	     }
	
	     ItemNode i, j;
	     for (i = head; i.next != null; i = i.next) {
	         for (j = i.next; j != null; j = j.next) {
	
	             if (i.itemName.compareToIgnoreCase(j.itemName) > 0) {
	                 swapData(i, j);
	             }
	         }
	     }
	
	     System.out.println("Inventory sorted by name (ascending)");
	 }
	
	 // Sort inventory by price (descending)
	 public void sortByPriceDescending() {
	
	     if (head == null) {
	         return;
	     }
	
	     ItemNode i, j;
	     for (i = head; i.next != null; i = i.next) {
	         for (j = i.next; j != null; j = j.next) {
	
	             if (i.price < j.price) {
	                 swapData(i, j);
	             }
	         }
	     }
	
	     System.out.println("Inventory sorted by price (descending)");
	 }
	
	 // Swap item data (used for sorting)
	 private void swapData(ItemNode a, ItemNode b) {
	
	     int tempId = a.itemId;
	     String tempName = a.itemName;
	     int tempQty = a.quantity;
	     double tempPrice = a.price;
	
	     a.itemId = b.itemId;
	     a.itemName = b.itemName;
	     a.quantity = b.quantity;
	     a.price = b.price;
	
	     b.itemId = tempId;
	     b.itemName = tempName;
	     b.quantity = tempQty;
	     b.price = tempPrice;
	 }
}

