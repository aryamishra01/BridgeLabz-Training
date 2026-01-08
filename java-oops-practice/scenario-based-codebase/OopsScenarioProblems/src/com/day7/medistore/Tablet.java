package com.day7.medistore;

import java.time.LocalDate;

class Tablet extends Medicine {

    public Tablet(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    // Preserved medicines expire normally
    @Override
    public boolean checkExpiry() {
        return super.checkExpiry();
    }
}

