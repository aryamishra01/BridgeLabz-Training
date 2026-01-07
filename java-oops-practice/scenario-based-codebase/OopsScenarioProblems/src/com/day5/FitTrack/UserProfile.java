package com.day5.FitTrack;

//User profile class
public class UserProfile {

	 private String name;
	 private int age;
	 private double weight;   // private health data
	 private String goal;
	
	 // Constructor with default goal
	 public UserProfile(String name, int age, double weight) {
	     this.name = name;
	     this.age = age;
	     this.weight = weight;
	     this.goal = "Stay Fit";
	 }
	
	 // Constructor with custom goal
	 public UserProfile(String name, int age, double weight, String goal) {
	     this.name = name;
	     this.age = age;
	     this.weight = weight;
	     this.goal = goal;
	 }
	
	 // Getter for weight (no setter for safety)
	 public double getWeight() {
	     return weight;
	 }
	
	 public String getName() {
	     return name;
	 }
	
	 public String getGoal() {
	     return goal;
	 }
}

