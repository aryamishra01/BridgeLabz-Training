package com.encapsulation.problem5;

public class Magazine extends LibraryItem implements Reservable {

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable()) {
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
