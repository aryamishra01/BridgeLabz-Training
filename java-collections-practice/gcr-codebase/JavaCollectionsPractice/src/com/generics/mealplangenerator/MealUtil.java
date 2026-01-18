package com.generics.mealplangenerator;

public class MealUtil {

    // Generic method works for any MealPlan type
    public static <T extends MealPlan> void generateMeal(T meal) {

        // Validation example: calories should be > 300
        if (meal.getCalories() < 300) {
            System.out.println("Invalid meal plan: calories too low!");
            return;
        }

        System.out.println("\nPersonalized Meal Plan Generated:");
        meal.showMeal();
    }
}

