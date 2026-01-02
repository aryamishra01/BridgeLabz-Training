package com.day2.ewallet;

public abstract class Wallet implements Transferable {

    private double balance; // protected through methods only

    public Wallet() {
        this.balance = 0;
    }

    // Constructor with referral bonus
    public Wallet(double referralBonus) {
        this.balance = referralBonus;
    }

    // Encapsulation: no direct access to balance
    public double getBalance() {
        return balance;
    }

    protected void addBalance(double amount) {
        this.balance += amount;
    }

    protected boolean deductBalance(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
