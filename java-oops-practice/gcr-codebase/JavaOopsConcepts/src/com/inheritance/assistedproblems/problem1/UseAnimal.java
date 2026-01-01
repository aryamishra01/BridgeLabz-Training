package com.inheritance.assistedproblems.problem1;

public class UseAnimal {

	public static void main(String[] args) {

        // Parent reference holding child objects (polymorphism)
        Animal a1 = new Dog("Buddy", 3);
        Animal a2 = new Cat("Whiskers", 2);
        Animal a3 = new Bird("Tweety", 1);

        // Same method call, different behavior
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
     
	}
}
