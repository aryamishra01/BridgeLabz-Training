package com.day5.petpal;

//Abstract base class for all pets
public abstract class Pet implements IInteractable {

	 // Common pet details
	 protected String name;
	 protected String type;
	 protected int age;
	
	 // Encapsulated attributes (cannot be accessed directly)
	 private int hunger;   // Hunger level (0–100)
	 private int energy;   // Energy level (0–100)
	 private int mood;     // Mood level (0–100)
	
	 // Constructor to initialize pet details
	 public Pet(String name, String type, int age) {
	     this.name = name;
	     this.type = type;
	     this.age = age;
	
	     // Default initial values
	     hunger = 50;
	     energy = 50;
	     mood = 50;
	 }
	
	 // Feeding reduces hunger and improves mood
	 public void feed() {
	     hunger -= 10;
	     mood += 5;
	     System.out.println(name + " is eating");
	     normalize();
	 }
	
	 // Playing increases mood but reduces energy
	 public void play() {
	     energy -= 10;
	     hunger += 5;
	     mood += 10;
	     System.out.println(name + " is playing");
	     normalize();
	 }
	
	 // Sleeping restores energy
	 public void sleep() {
	     energy += 20;
	     hunger += 5;
	     System.out.println(name + " is sleeping");
	     normalize();
	 }
	
	 // Keeps all values within 0–100 range
	 private void normalize() {
	     hunger = Math.max(0, Math.min(100, hunger));
	     energy = Math.max(0, Math.min(100, energy));
	     mood = Math.max(0, Math.min(100, mood));
	 }
	
	 // Displays current pet status
	 public void showStatus() {
	     System.out.println("\n--- Pet Status ---");
	     System.out.println("Name   : " + name);
	     System.out.println("Type   : " + type);
	     System.out.println("Age    : " + age);
	     System.out.println("Hunger : " + hunger);
	     System.out.println("Energy : " + energy);
	     System.out.println("Mood   : " + mood);
	 }
	
	 // Abstract method for polymorphism
	 public abstract void makeSound();
}

