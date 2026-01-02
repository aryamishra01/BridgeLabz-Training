package com.day2.ewallet;

public class PersonalWallet extends Wallet {

    private static final double TRANSFER_LIMIT = 5000;

    public PersonalWallet() {
        super();
    }

    public PersonalWallet(double referralBonus) {
        super(referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > TRANSFER_LIMIT) {
            System.out.println("Transfer failed: Exceeds personal wallet limit.");
            return;
        }

        if (deductBalance(amount)) {
            receiver.getWallet().addBalance(amount);
            System.out.println("Transferred ₹" + amount + " to " + receiver.getName());
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
