package com.day5.petpal;

//Dog class inherits Pet
public class Dog extends Pet {

	 // Constructor for Dog
	 public Dog(String name, int age) {
	     super(name, "Dog", age);
	 }
	
	 // Dog-specific sound
	 public void makeSound() {
	     System.out.println(name + " says: Woof Woof");
	 }
}

