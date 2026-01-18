package com.generics.smartwarehousemanagementsystem;

import java.util.List;

//Utility class to display any type of WarehouseItem
public class WarehouseUtil {

 // Wildcard allows Electronics, Groceries, Furniture etc.
 public static void displayAllItems(List<? extends WarehouseItem> list) {

     System.out.println("\n--- Items in Warehouse ---");

     for (WarehouseItem item : list) {
         item.displayInfo();   // runtime polymorphism
     }
 }
}

