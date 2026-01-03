package com.encapsulation.problem4;

public class SavingsAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.04; // 4%

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    // Interest = balance × rate
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    // Apply for loan
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan request of ₹" + amount + " submitted for Savings Account.");
    }

    // Loan eligibility logic
    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; // eligible up to 5× balance
    }
}
