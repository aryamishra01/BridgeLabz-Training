package com.day5.FitTrack;

import java.util.Scanner;

public class FitTrackApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User profile input
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Goal (or press Enter for default): ");
        String goal = sc.nextLine();

        UserProfile user;
        if (goal.isEmpty()) {
            user = new UserProfile(name, age, weight);
        } else {
            user = new UserProfile(name, age, weight, goal);
        }

        // Workout input
        System.out.print("Select Workout (1-Cardio, 2-Strength): ");
        int choice = sc.nextInt();

        System.out.print("Enter Duration (minutes): ");
        int duration = sc.nextInt();

        Workout workout;

        // Runtime polymorphism
        if (choice == 1) {
            workout = new CardioWorkout(duration);
        } else {
            workout = new StrengthWorkout(duration);
        }

        workout.startWorkout();
        workout.calculateCalories(user.getWeight());
        workout.stopWorkout();

        // Operator usage for progress
        double dailyTarget = 500; // target calories
        double progress = dailyTarget - workout.getCaloriesBurned();

        System.out.println("\n--- Workout Summary ---");
        System.out.println("User: " + user.getName());
        System.out.println("Goal: " + user.getGoal());
        System.out.println("Calories Burned: " + workout.getCaloriesBurned());
        System.out.println("Remaining Calories to Target: " + progress);

        sc.close();
    }
}

