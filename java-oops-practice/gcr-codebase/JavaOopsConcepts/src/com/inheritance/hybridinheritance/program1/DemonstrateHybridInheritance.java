package com.inheritance.hybridinheritance.program1;

public class DemonstrateHybridInheritance {

	public static void main(String[] args) {

        Worker chef = new Chef("Rahul", 101, "Italian Cuisine");
        Worker waiter = new Waiter("Aman", 202, 5);

        System.out.println("---- Chef Details ----");
        ((Person) chef).displayInfo();
        chef.performDuties();

        System.out.println("\n---- Waiter Details ----");
        ((Person) waiter).displayInfo();
        waiter.performDuties();
    }

}
