package com.generics.mealplangenerator;

public class VeganMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public int getCalories() {
        return 450;
    }

    @Override
    public void showMeal() {
        System.out.println("Vegan Meal: Tofu, Quinoa, Veggies | Calories: 450");
    }
}

