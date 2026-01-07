package com.day5.FitTrack;

//Cardio workout
public class CardioWorkout extends Workout {

	 public CardioWorkout(int duration) {
	     super("Cardio", duration);
	 }
	
	 // Polymorphic calorie calculation
	 @Override
	 public void calculateCalories(double weight) {
	     // Calories burned formula for cardio
	     caloriesBurned = duration * weight * 0.08;
	 }
}

