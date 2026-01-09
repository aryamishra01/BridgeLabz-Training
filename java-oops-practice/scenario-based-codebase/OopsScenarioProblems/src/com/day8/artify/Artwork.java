package com.day8.artify;

abstract class Artwork implements IPurchasable {
    protected String title;
    protected String artist;
    protected double price;
    protected String licenseType;

    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
    }

    // Print artwork details with star marks
    public void showDetails() {
        System.out.println();
        System.out.println("           ARTWORK DETAILS          ");
        System.out.println("*************************************");
        System.out.println(" Title   : " + title);
        System.out.println(" Artist  : " + artist);
        System.out.println(" Price   : ₹" + price);
        System.out.println(" License : " + licenseType);
        System.out.println("*************************************");
    }
}

