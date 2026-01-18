package com.generics.mealplangenerator;

//Handles any type of MealPlan safely
public class Meal<T extends MealPlan> {

 private T mealPlan;

 public Meal(T mealPlan) {
     this.mealPlan = mealPlan;
 }

 public T getMealPlan() {
     return mealPlan;
 }
}

