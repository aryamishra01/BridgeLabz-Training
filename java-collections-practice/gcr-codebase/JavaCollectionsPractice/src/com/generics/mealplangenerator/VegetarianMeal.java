package com.generics.mealplangenerator;

public class VegetarianMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public int getCalories() {
        return 500;
    }

    @Override
    public void showMeal() {
        System.out.println("Vegetarian Meal: Paneer, Rice, Salad | Calories: 500");
    }
}

