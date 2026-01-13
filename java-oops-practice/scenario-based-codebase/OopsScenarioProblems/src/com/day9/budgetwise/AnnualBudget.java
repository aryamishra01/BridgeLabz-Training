package com.day9.budgetwise;

public class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit, String[] categories, double[] categoryLimits) {
        super(income, limit, categories, categoryLimits);
    }

    // Yearly report format
    public void generateReport() {
        System.out.println("Annual Budget Report");
        System.out.println("Annual Savings: " + calculateNetSavings());
    }

    public void detectOverspend() {
        double totalExpense = income - calculateNetSavings();
        if (totalExpense > limit) {
            System.out.println("Annual budget exceeded");
        } else {
            System.out.println("Annual spending is within limit");
        }
    }
}

