package com.day7.medistore;

import java.time.LocalDate;

class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        // Strict expiry rules
        return super.checkExpiry();
    }
}

