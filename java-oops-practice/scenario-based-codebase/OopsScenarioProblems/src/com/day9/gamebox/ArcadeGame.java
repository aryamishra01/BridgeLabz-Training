package com.day9.gamebox;

public class ArcadeGame extends Game {

    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    public void download() {
        System.out.println(title + " downloaded");
    }

    // Polymorphic demo behavior
    public void playDemo() {
        System.out.println("Quick action demo for arcade game");
    }
}

