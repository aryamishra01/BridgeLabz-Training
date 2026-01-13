package com.day9.budgetwise;

import java.util.Scanner;

public class BudgetWiseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter budget type");
        System.out.println("1 Monthly 2 Annual");
        int type = sc.nextInt();

        System.out.println("Enter total income");
        double income = sc.nextDouble();

        System.out.println("Enter spending limit");
        double limit = sc.nextDouble();

        System.out.println("Enter number of categories");
        int n = sc.nextInt();
        sc.nextLine();

        String[] categories = new String[n];
        double[] categoryLimits = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter category name");
            categories[i] = sc.nextLine();

            System.out.println("Enter category limit");
            categoryLimits[i] = sc.nextDouble();
            sc.nextLine();
        }

        Budget budget;

        // Runtime polymorphism
        if (type == 1) {
            budget = new MonthlyBudget(income, limit, categories, categoryLimits);
        } else {
            budget = new AnnualBudget(income, limit, categories, categoryLimits);
        }

        System.out.println("Enter number of transactions");
        int tCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < tCount; i++) {
            System.out.println("Enter amount");
            double amt = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter type income or expense");
            String tType = sc.nextLine();

            System.out.println("Enter date");
            String date = sc.nextLine();

            System.out.println("Enter category");
            String cat = sc.nextLine();

            budget.addTransaction(new Transaction(amt, tType, date, cat));
        }

        budget.generateReport();
        budget.detectOverspend();

        sc.close();
    }
}

