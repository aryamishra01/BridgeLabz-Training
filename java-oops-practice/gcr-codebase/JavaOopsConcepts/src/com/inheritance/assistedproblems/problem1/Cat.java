package com.inheritance.assistedproblems.problem1;

//Cat inherits from Animal
class Cat extends Animal {

 public Cat(String name, int age) {
     super(name, age);
 }

 // Overriding makeSound()
 @Override
 public void makeSound() {
     System.out.println(name + " says: Meow!");
 }
}

