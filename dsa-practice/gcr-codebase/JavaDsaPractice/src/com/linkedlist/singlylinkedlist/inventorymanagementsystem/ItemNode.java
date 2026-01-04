package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

//This class represents a single item in the inventory
public class ItemNode {

	 int itemId;          // Unique item ID
	 String itemName;     // Name of the item
	 int quantity;        // Quantity available
	 double price;        // Price per unit
	
	 ItemNode next;       // Reference to next item
	
	 // Constructor to initialize item details
	 public ItemNode(int itemId, String itemName, int quantity, double price) {
	     this.itemId = itemId;
	     this.itemName = itemName;
	     this.quantity = quantity;
	     this.price = price;
	     this.next = null;
	 }
}
