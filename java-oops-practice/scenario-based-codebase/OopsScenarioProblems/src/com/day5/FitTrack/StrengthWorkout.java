package com.day5.FitTrack;

//Strength workout
public class StrengthWorkout extends Workout {

	 public StrengthWorkout(int duration) {
	     super("Strength", duration);
	 }
	
	 @Override
	 public void calculateCalories(double weight) {
	     // Calories burned formula for strength training
	     caloriesBurned = duration * weight * 0.06;
	 }
}

