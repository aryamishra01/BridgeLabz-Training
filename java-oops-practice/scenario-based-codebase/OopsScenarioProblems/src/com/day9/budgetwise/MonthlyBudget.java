package com.day9.budgetwise;

public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit, String[] categories, double[] categoryLimits) {
        super(income, limit, categories, categoryLimits);
    }

    // Monthly report format
    public void generateReport() {
        System.out.println("Monthly Budget Report");
        System.out.println("Net Savings: " + calculateNetSavings());
    }

    public void detectOverspend() {
        double totalExpense = income - calculateNetSavings();
        if (totalExpense > limit) {
            System.out.println("Monthly budget exceeded");
        } else {
            System.out.println("Monthly spending is within limit");
        }
    }
}

