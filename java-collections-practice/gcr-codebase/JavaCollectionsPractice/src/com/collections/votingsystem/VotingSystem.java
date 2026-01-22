package com.collections.votingsystem;

import java.util.*;

public class VotingSystem {

    // Candidate -> Votes
    static HashMap<String, Integer> voteCount = new HashMap<>();

    // Order of voting
    static LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== Voting System ======");
            System.out.println("1. Cast Vote");
            System.out.println("2. Show Vote Count (HashMap)");
            System.out.println("3. Show Vote Order (LinkedHashMap)");
            System.out.println("4. Show Sorted Results (TreeMap)");
            System.out.println("5. Show Winner");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> castVote(sc);
                case 2 -> showVoteCount();
                case 3 -> showVoteOrder();
                case 4 -> showSortedResults();
                case 5 -> showWinner();
                case 0 -> System.out.println("Exiting Voting System...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }

    // ---------------- CAST VOTE ----------------
    static void castVote(Scanner sc) {

        System.out.print("Enter Candidate Name: ");
        String name = sc.next();

        // HashMap → total votes
        voteCount.put(name, voteCount.getOrDefault(name, 0) + 1);

        // LinkedHashMap → order of votes
        voteOrder.put(name, voteOrder.getOrDefault(name, 0) + 1);

        System.out.println("Vote Casted Successfully!");
    }

    // ---------------- SHOW VOTE COUNT ----------------
    static void showVoteCount() {

        System.out.println("\nVote Count (HashMap):");

        for (Map.Entry<String, Integer> e : voteCount.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

    // ---------------- SHOW VOTE ORDER ----------------
    static void showVoteOrder() {

        System.out.println("\nVote Order (LinkedHashMap):");

        for (Map.Entry<String, Integer> e : voteOrder.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

    // ---------------- SORTED RESULTS ----------------
    static void showSortedResults() {

        TreeMap<String, Integer> sortedMap = new TreeMap<>(voteCount);

        System.out.println("\nSorted Results (TreeMap):");

        for (Map.Entry<String, Integer> e : sortedMap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

    // ---------------- FIND WINNER ----------------
    static void showWinner() {

        String winner = null;
        int maxVotes = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> e : voteCount.entrySet()) {

            if (e.getValue() > maxVotes) {
                maxVotes = e.getValue();
                winner = e.getKey();
            }
        }

        if (winner != null)
            System.out.println("Winner: " + winner + " with " + maxVotes + " votes");
        else
            System.out.println("No votes cast yet!");
    }
}

