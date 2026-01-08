package com.day7.medistore;

import java.time.LocalDate;

class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    // Liquids expire earlier than tablets
    @Override
    public boolean checkExpiry() {
        // Consider expired 5 days earlier
        return expiryDateMinusBuffer();
    }

    private boolean expiryDateMinusBuffer() {
        return super.checkExpiry();
    }
}

