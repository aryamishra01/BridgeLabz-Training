package com.generics.mealplangenerator;

public class HighProteinMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "High Protein";
    }

    @Override
    public int getCalories() {
        return 700;
    }

    @Override
    public void showMeal() {
        System.out.println("High Protein Meal: Grilled Chicken, Beans | Calories: 700");
    }
}

