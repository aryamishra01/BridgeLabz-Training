package com.bankingsystem;

public class BankingSystem {

	public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new Transaction(account, "Arya", 3000));
        Thread t2 = new Thread(new Transaction(account, "Bhumika", 4000));
        Thread t3 = new Thread(new Transaction(account, "Disha", 2000));
        Thread t4 = new Thread(new Transaction(account, "Rashi", 5000));
        Thread t5 = new Thread(new Transaction(account, "Yukta", 1500));

        // Display thread states before start
        System.out.println("Thread States Before Start:");
        System.out.println(t1.getName() + " : " + t1.getState());
        System.out.println(t2.getName() + " : " + t2.getState());
        System.out.println(t3.getName() + " : " + t3.getState());
        System.out.println(t4.getName() + " : " + t4.getState());
        System.out.println(t5.getName() + " : " + t5.getState());

        // Start transactions
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
