package com.day2.ewallet;

public class EWalletApp {

	public static void main(String[] args) {

        // Users with different wallets
        User u1 = new User(1, "Aman", new PersonalWallet(500));
        User u2 = new User(2, "Riya", new BusinessWallet(1000));

        u1.showBalance();
        u2.showBalance();

        System.out.println();

        // Transfers (polymorphism in action)
        u1.getWallet().transferTo(u2, 300);
        u2.getWallet().transferTo(u1, 400);

        System.out.println();

        u1.showBalance();
        u2.showBalance();
    }
}
