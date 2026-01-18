package com.generics.mealplangenerator;

//Common contract for all meal plans
public interface MealPlan {

 String getMealType();     // Veg, Vegan, Keto, etc.
 int getCalories();        // calories of meal
 void showMeal();          // display meal details
}

