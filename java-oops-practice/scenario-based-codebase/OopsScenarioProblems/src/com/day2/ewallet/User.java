package com.day2.ewallet;

public class User {

    private int userId;
    private String name;
    private Wallet wallet;

    public User(int userId, String name, Wallet wallet) {
        this.userId = userId;
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void showBalance() {
        System.out.println(name + "'s Balance: ₹" + wallet.getBalance());
    }
}
