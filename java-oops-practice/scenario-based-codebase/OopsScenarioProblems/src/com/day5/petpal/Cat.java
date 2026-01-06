package com.day5.petpal;

//Cat class inherits Pet
public class Cat extends Pet {

	 // Constructor for Cat
	 public Cat(String name, int age) {
	     super(name, "Cat", age);
	 }
	
	 // Cat-specific sound
	 public void makeSound() {
	     System.out.println(name + " says: Meow");
	 }
}
