package com.day9.gamebox;

public class User {

    private String name;
    private Game[] ownedGames;
    private int gameCount;

    public User(String name) {
        this.name = name;
        this.ownedGames = new Game[10];
        this.gameCount = 0;
    }

    // Controlled game ownership
    public void addGame(Game game) {
        ownedGames[gameCount++] = game;
        System.out.println(game.title + " added to library");
    }

    public void showOwnedGames() {
        System.out.println("Owned Games");
        for (int i = 0; i < gameCount; i++) {
            System.out.println(ownedGames[i].title);
        }
    }
}

