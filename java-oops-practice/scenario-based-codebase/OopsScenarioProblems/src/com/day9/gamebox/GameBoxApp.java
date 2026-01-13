package com.day9.gamebox;

import java.util.Scanner;

public class GameBoxApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter user name");
        String userName = sc.nextLine();
        User user = new User(userName);

        System.out.println("Select game type");
        System.out.println("1 Arcade 2 Strategy");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter game title");
        String title = sc.nextLine();

        System.out.println("Enter game price");
        double price = sc.nextDouble();

        System.out.println("Enter game rating");
        double rating = sc.nextDouble();

        Game game;

        // Runtime polymorphism
        if (type == 1) {
            game = new ArcadeGame(title, price, rating);
        } else {
            game = new StrategyGame(title, price, rating);
        }

        System.out.println("Play demo");
        game.playDemo();

        System.out.println("Enter seasonal discount percentage");
        double discount = sc.nextDouble();

        double finalPrice = game.applyOffer(discount);
        System.out.println("Final price is " + finalPrice);

        game.download();
        user.addGame(game);
        user.showOwnedGames();

        sc.close();
    }
}

