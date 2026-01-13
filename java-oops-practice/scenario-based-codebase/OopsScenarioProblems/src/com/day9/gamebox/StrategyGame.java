package com.day9.gamebox;

public class StrategyGame extends Game {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    public void download() {
        System.out.println(title + " downloaded");
    }

    public void playDemo() {
        System.out.println("Turn based strategy demo");
    }
}

