package com.day5.FitTrack;

import java.util.ArrayList;
import java.util.List;

// Base Workout class
public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration;           // in minutes
    protected double caloriesBurned;

    // Internal workout logs (restricted access)
    private List<String> workoutLogs = new ArrayList<>();

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    // Abstract method for polymorphism
    public abstract void calculateCalories(double weight);

    @Override
    public void startWorkout() {
        workoutLogs.add(type + " workout started");
        System.out.println(type + " workout started.");
    }

    @Override
    public void stopWorkout() {
        workoutLogs.add(type + " workout stopped");
        System.out.println(type + " workout stopped.");
    }

    // Read-only access
    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}

