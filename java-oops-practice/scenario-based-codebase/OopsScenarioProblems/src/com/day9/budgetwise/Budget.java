package com.day9.budgetwise;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;
    protected String[] categories;
    protected double[] categoryLimits;
    protected Transaction[] transactions;
    protected int transactionCount;

    // Constructor for custom categories
    public Budget(double income, double limit, String[] categories, double[] categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categories = categories;
        this.categoryLimits = categoryLimits;
        this.transactions = new Transaction[50];
        this.transactionCount = 0;
    }

    // Controlled expense addition
    public void addTransaction(Transaction t) {
        transactions[transactionCount++] = t;
    }

    // Operator usage for net savings
    public double calculateNetSavings() {
        double totalExpense = 0;

        for (int i = 0; i < transactionCount; i++) {
            if (transactions[i].getType().equalsIgnoreCase("expense")) {
                totalExpense += transactions[i].getAmount();
            }
        }
        return income - totalExpense;
    }
}

