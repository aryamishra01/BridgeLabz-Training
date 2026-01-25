package com.day11.avltree;

import java.util.Scanner;

public class GamingLeaderboardAVL {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AvlLeaderboard leaderboard = new AvlLeaderboard();

        while (true) {

            System.out.println("\nMenu");
            System.out.println("1 Insert or Update Player");
            System.out.println("2 Display Top Players");
            System.out.println("3 Remove Player");
            System.out.println("4 Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("Enter player name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter score: ");
                    int score = sc.nextInt();
                    leaderboard.insertPlayer(name, score);
                    break;

                case 2:
                    leaderboard.displayTopPlayers();
                    break;

                case 3:
                    System.out.print("Enter score of player to remove: ");
                    int s = sc.nextInt();
                    leaderboard.removePlayer(s);
                    break;

                case 4:
                    System.out.println("Exiting");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
