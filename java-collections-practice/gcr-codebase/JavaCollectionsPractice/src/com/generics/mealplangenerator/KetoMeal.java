package com.generics.mealplangenerator;

public class KetoMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public int getCalories() {
        return 600;
    }

    @Override
    public void showMeal() {
        System.out.println("Keto Meal: Chicken, Eggs, Avocado | Calories: 600");
    }
}

