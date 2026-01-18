package com.generics.mealplangenerator;

import java.util.Scanner;

public class MealPlanApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MEAL PLAN GENERATOR =====");
            System.out.println("1. Vegetarian");
            System.out.println("2. Vegan");
            System.out.println("3. Keto");
            System.out.println("4. High Protein");
            System.out.println("0. Exit");
            System.out.print("Choose Meal Type: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Meal<VegetarianMeal> vegMeal =
                            new Meal<>(new VegetarianMeal());
                    MealUtil.generateMeal(vegMeal.getMealPlan());
                    break;

                case 2:
                    Meal<VeganMeal> veganMeal =
                            new Meal<>(new VeganMeal());
                    MealUtil.generateMeal(veganMeal.getMealPlan());
                    break;

                case 3:
                    Meal<KetoMeal> ketoMeal =
                            new Meal<>(new KetoMeal());
                    MealUtil.generateMeal(ketoMeal.getMealPlan());
                    break;

                case 4:
                    Meal<HighProteinMeal> proteinMeal =
                            new Meal<>(new HighProteinMeal());
                    MealUtil.generateMeal(proteinMeal.getMealPlan());
                    break;

                case 0:
                    System.out.println("Stay Healthy! ");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}

