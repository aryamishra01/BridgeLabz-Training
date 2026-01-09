package com.day8.foodloop;

import java.util.*;

public class FoodLoopApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodItem burger = new VegItem("Veg Burger", 120, 5);
        FoodItem pizza = new VegItem("Cheese Pizza", 250, 3);
        FoodItem biryani = new NonVeg("Chicken Biryani", 300, 4);
        FoodItem fish = new NonVeg("Fish Fry", 280, 2);

        List<FoodItem> menu = Arrays.asList(burger, pizza, biryani, fish);
        List<FoodItem> cart = new ArrayList<>();

        System.out.println("********************************");
        System.out.println("  WELCOME TO FOODLOOP APP  ");
        System.out.println("********************************");

        while (true) {
            System.out.println("\nMenu:");
            for (int i = 0; i < menu.size(); i++) {
                System.out.print((i + 1) + ". ");
                menu.get(i).showDetails();
            }

            System.out.println("5. Place Order");
            System.out.println("6. Cancel Order");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                cart.add(menu.get(choice - 1));
                System.out.println("Item added to cart");
            } 
            else if (choice == 5) {
                Order order = new Order(cart);
                order.placeOrder();
                break;
            } 
            else if (choice == 6) {
                Order order = new Order(cart);
                order.cancelOrder();
                break;
            } 
            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}

