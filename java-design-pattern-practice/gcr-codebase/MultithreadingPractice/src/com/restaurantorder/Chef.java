package com.restaurantorder;

public class Chef extends Thread {

    private String chefName;
    private String dish;
    private int cookingTime; // total cooking time in milliseconds

    Chef(String chefName, String dish, int cookingTime) {
        this.chefName = chefName;
        this.dish = dish;
        this.cookingTime = cookingTime;
    }

    public void run() {
        try {
        	
        	for (int i = 25; i <= 100; i += 25) {
        	    System.out.println(chefName + " preparing " + dish + ": " + i + "% complete");
        	    Thread.sleep(cookingTime / 4);   // stepTime = cookingTime / 4
        	}

        } catch (InterruptedException e) {
            System.out.println(chefName + " was interrupted.");
        }
    }
}

