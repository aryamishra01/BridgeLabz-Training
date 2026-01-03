package com.encapsulation.problem5;

public class DVD extends LibraryItem implements Reservable {

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable()) {
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD already issued.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
