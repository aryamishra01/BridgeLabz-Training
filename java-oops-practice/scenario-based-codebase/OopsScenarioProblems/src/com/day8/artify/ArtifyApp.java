package com.day8.artify;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class ArtifyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("   WELCOME TO ARTIFY MARKETPLACE   ");
        System.out.println("****************************************");

        System.out.println("Choose your role:");
        System.out.println("1. Artist");
        System.out.println("2. Buyer");
        System.out.print("Enter choice: ");
        int role = sc.nextInt();
        sc.nextLine(); // consume newline

        if (role == 1) {
            // Artist flow
            System.out.print("Enter Artist Name: ");
            String artistName = sc.nextLine();

            System.out.print("Enter Artwork Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter License Type: ");
            String license = sc.nextLine();

            System.out.println("Select Art Type (1 - Digital, 2 - Print): ");
            int type = sc.nextInt();

            Artwork art;
            if (type == 1) art = new DigitalArt(title, artistName, price, license);
            else art = new PrintArt(title, artistName, price, license);

            System.out.println("\nArtwork Posted Successfully!");
            art.showDetails();
            art.license();

        } else if (role == 2) {
            // Buyer flow
            System.out.print("Enter Buyer Name: ");
            String buyerName = sc.nextLine();

            System.out.print("Enter Wallet Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();

            User buyer = new User(buyerName, balance);

            System.out.print("Enter Artwork Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Artist Name: ");
            String artistName = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter License Type: ");
            String license = sc.nextLine();

            System.out.println("Select Art Type (1 - Digital, 2 - Print): ");
            int type = sc.nextInt();

            Artwork art;
            if (type == 1) art = new DigitalArt(title, artistName, price, license);
            else art = new PrintArt(title, artistName, price, license);

            art.showDetails();
            art.purchase(buyer);
            art.license();

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

