package com.inheritance.assistedproblems.problem1;

//Bird inherits from Animal
class Bird extends Animal {

 public Bird(String name, int age) {
     super(name, age);
 }

 // Overriding makeSound()
 @Override
 public void makeSound() {
     System.out.println(name + " says: Tweet!");
 }
}

