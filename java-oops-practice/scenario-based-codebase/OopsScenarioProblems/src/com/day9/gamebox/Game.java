package com.day9.gamebox;

public abstract class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    // Constructor for free or paid game
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Seasonal offer using operator
    public double applyOffer(double discountPercent) {
        return price - (price * discountPercent / 100);
    }
}

