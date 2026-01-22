package com.collections.bankingsystem;

import java.util.*;

public class BankingSystem {

    // AccountNumber -> Balance
    static HashMap<Integer, Double> accounts = new HashMap<>();

    // Withdrawal Request Queue
    static Queue<WithdrawalRequest> queue = new LinkedList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== Banking System Menu ======");
            System.out.println("1. Add Account");
            System.out.println("2. Deposit");
            System.out.println("3. Request Withdrawal");
            System.out.println("4. Process Withdrawal Queue");
            System.out.println("5. Show Accounts Sorted by Balance");
            System.out.println("6. Show All Accounts");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addAccount(sc);
                case 2 -> deposit(sc);
                case 3 -> requestWithdrawal(sc);
                case 4 -> processWithdrawals();
                case 5 -> showSortedByBalance();
                case 6 -> showAllAccounts();
                case 0 -> System.out.println("Thank you for using Banking System!");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }

    // ---------------- ADD ACCOUNT ----------------
    static void addAccount(Scanner sc) {

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        accounts.put(acc, bal);
        System.out.println("Account Created!");
    }

    // ---------------- DEPOSIT ----------------
    static void deposit(Scanner sc) {

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        if (!accounts.containsKey(acc)) {
            System.out.println("Account not found!");
            return;
        }

        System.out.print("Enter Deposit Amount: ");
        double amt = sc.nextDouble();

        accounts.put(acc, accounts.get(acc) + amt);
        System.out.println("Deposit Successful!");
    }

    // ---------------- WITHDRAW REQUEST ----------------
    static void requestWithdrawal(Scanner sc) {

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();

        queue.add(new WithdrawalRequest(acc, amt));
        System.out.println("Withdrawal Request Added to Queue!");
    }

    // ---------------- PROCESS QUEUE ----------------
    static void processWithdrawals() {

        if (queue.isEmpty()) {
            System.out.println("No pending withdrawal requests.");
            return;
        }

        WithdrawalRequest req = queue.poll();

        if (!accounts.containsKey(req.accountNumber)) {
            System.out.println("Account not found for request: " + req.accountNumber);
            return;
        }

        double bal = accounts.get(req.accountNumber);

        if (bal >= req.amount) {
            accounts.put(req.accountNumber, bal - req.amount);
            System.out.println("Withdrawal Successful for Account: " + req.accountNumber);
        } else {
            System.out.println("Insufficient Balance for Account: " + req.accountNumber);
        }
    }

    // ---------------- SORT BY BALANCE ----------------
    static void showSortedByBalance() {

        TreeMap<Double, List<Integer>> sorted = new TreeMap<>();

        for (Map.Entry<Integer, Double> e : accounts.entrySet()) {
            sorted.putIfAbsent(e.getValue(), new ArrayList<>());
            sorted.get(e.getValue()).add(e.getKey());
        }

        System.out.println("\nAccounts Sorted by Balance:");

        for (Map.Entry<Double, List<Integer>> e : sorted.entrySet()) {
            for (int acc : e.getValue()) {
                System.out.println("Acc: " + acc + " | Balance: ₹" + e.getKey());
            }
        }
    }

    // ---------------- SHOW ALL ----------------
    static void showAllAccounts() {

        System.out.println("\nAll Accounts:");

        for (Map.Entry<Integer, Double> e : accounts.entrySet()) {
            System.out.println("Acc: " + e.getKey() + " | Balance: ₹" + e.getValue());
        }
    }
}

