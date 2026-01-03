package com.encapsulation.problem5;

public class DemonstratePolymorphism {

	public static void main(String[] args) {

        System.out.println("===== Library Management System =====\n");

        // Polymorphism
        LibraryItem item1 = new Book(101, "Java Programming", "James Gosling");
        LibraryItem item2 = new Magazine(102, "Tech Monthly", "Editorial Team");
        LibraryItem item3 = new DVD(103, "AI Documentary", "OpenAI Studios");

        LibraryItem[] items = { item1, item2, item3 };

        for (LibraryItem item : items) {
            System.out.println("----------------------------------");
            item.getItemDetails();
        }

        System.out.println("\n--- Borrowing a Book ---");
        item1.setBorrowerName("Arya Mishra");
        item1.getItemDetails();

        System.out.println("\n--- Reserving Items ---");
        ((Reservable) item1).reserveItem();
        ((Reservable) item2).reserveItem();
        ((Reservable) item3).reserveItem();

        System.out.println("\n--- Returning Book ---");
        item1.returnItem();
        item1.getItemDetails();
    }
}
