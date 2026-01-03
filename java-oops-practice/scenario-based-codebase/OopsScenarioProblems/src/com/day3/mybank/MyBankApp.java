package com.day3.mybank;

import java.util.Scanner;

public class MyBankApp {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account account = null;

        System.out.print("Enter Account Number: ");
        String accNo = input.nextLine();

        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();

        System.out.print("Enter Opening Balance: ");
        double balance = input.nextDouble();

        // Polymorphism
        if (choice == 1) {
            account = new SavingsAccount(accNo, balance);
        } else if (choice == 2) {
            account = new CurrentAccount(accNo, balance);
        } else {
            System.out.println("Invalid account type!");
            System.exit(0);
        }

        int option;
        do {
            System.out.println("\n--- MyBank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Exit");
            System.out.print("Enter option: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(input.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(input.nextDouble());
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    account.calculateInterest();
                    break;

                case 5:
                    System.out.println("Thank you for using MyBank!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (option != 5);

        input.close();
    }
}


