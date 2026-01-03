package com.encapsulation.problem5;

public class Book extends LibraryItem implements Reservable {

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable()) {
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is currently not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
