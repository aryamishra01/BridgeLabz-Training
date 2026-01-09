package com.day8.artify;

class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    @Override
    public void purchase(User buyer) {
        if (buyer.getWalletBalance() >= price) {
            buyer.deductAmount(price);
            System.out.println("Purchase successful! Remaining Balance: ₹" + buyer.getWalletBalance());
        } else {
            System.out.println("Insufficient wallet balance!");
        }
    }

    @Override
    public void license() {
        System.out.println("\nPrint Art License:");
        System.out.println("- Physical prints allowed");
        System.out.println("- Digital reproduction restricted");
    }
}


