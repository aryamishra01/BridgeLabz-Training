package com.day5.petpal;

//Bird class inherits Pet
public class Bird extends Pet {

	 // Constructor for Bird
	 public Bird(String name, int age) {
	     super(name, "Bird", age);
	 }
	
	 // Bird-specific sound
	 public void makeSound() {
	     System.out.println(name + " says: Chirp Chirp");
	 }
}
