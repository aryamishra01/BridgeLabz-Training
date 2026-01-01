package com.inheritance.assistedproblems.problem1;

//Superclass representing a generic animal
public class Animal {

 protected String name;
 protected int age;

 public Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method to be overridden by subclasses
 public void makeSound() {
     System.out.println("Animal makes a sound");
 }
}
