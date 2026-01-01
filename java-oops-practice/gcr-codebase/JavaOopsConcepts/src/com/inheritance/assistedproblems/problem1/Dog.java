package com.inheritance.assistedproblems.problem1;

//Dog inherits from Animal
class Dog extends Animal {

 public Dog(String name, int age) {
     super(name, age);
 }

 // Overriding makeSound()
 @Override
 public void makeSound() {
     System.out.println(name + " says: Woof!");
 }
}

