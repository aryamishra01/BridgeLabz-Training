package com.day2.ewallet;

public class BusinessWallet extends Wallet {

    private static final double TAX_RATE = 0.02; // 2% transaction tax

    public BusinessWallet() {
        super();
    }

    public BusinessWallet(double referralBonus) {
        super(referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * TAX_RATE;
        double totalDeduction = amount + tax;

        if (deductBalance(totalDeduction)) {
            receiver.getWallet().addBalance(amount);
            System.out.println("Transferred ₹" + amount +
                    " (Tax ₹" + tax + " deducted)");
        } else {
            System.out.println("Insufficient balance (including tax).");
        }
    }
}
