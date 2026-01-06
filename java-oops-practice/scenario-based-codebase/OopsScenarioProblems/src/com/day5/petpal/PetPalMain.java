package com.day5.petpal;

import java.util.Scanner;

//Main class to run the PetPal application
public class PetPalMain {

	 public static void main(String[] args) {
	
	     Scanner sc = new Scanner(System.in);
	     Pet pet; // Reference for polymorphism
	
	     System.out.println("Welcome to PetPal");
	
	     // Taking pet details from user
	     System.out.print("Enter pet name: ");
	     String name = sc.nextLine();
	
	     System.out.print("Enter pet age: ");
	     int age = sc.nextInt();
	
	     // Choosing pet type
	     System.out.println("1. Dog  2. Cat  3. Bird");
	     System.out.print("Choose pet type: ");
	     int choice = sc.nextInt();
	
	     // Creating pet object based on user choice
	     switch (choice) {
	         case 1:
	             pet = new Dog(name, age);
	             break;
	         case 2:
	             pet = new Cat(name, age);
	             break;
	         case 3:
	             pet = new Bird(name, age);
	             break;
	         default:
	             System.out.println("Invalid choice");
	             sc.close();
	             return;
	     }
	
	     int option;
	     do {
	         // Menu-driven actions
	         System.out.println("\n1. Feed  2. Play  3. Sleep  4. Sound  5. Status  0. Exit");
	         System.out.print("Enter choice: ");
	         option = sc.nextInt();
	
	         switch (option) {
	             case 1: pet.feed(); break;
	             case 2: pet.play(); break;
	             case 3: pet.sleep(); break;
	             case 4: pet.makeSound(); break;
	             case 5: pet.showStatus(); break;
	             case 0: System.out.println("Thank you for using PetPal"); break;
	             default: System.out.println("Invalid option");
	         }
	
	     } while (option != 0);
	
	     sc.close();
	 }
}

