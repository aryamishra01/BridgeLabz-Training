package com.encapsulation.problem4;

public class CurrentAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.02; // 2%

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan request of ₹" + amount + " submitted for Current Account.");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 10; // higher eligibility
    }
}
