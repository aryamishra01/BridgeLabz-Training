package com.day5.robowarehouse;

public class RoboWarehouse {


	    // Insertion Sort based on package weight
	    public static void insertionSort(Package[] shelf) {

	        for (int i = 1; i < shelf.length; i++) {

	            Package newPackage = shelf[i]; // package to insert
	            int j = i - 1;

	            // Shift heavier packages to the right
	            while (j >= 0 && shelf[j].weight > newPackage.weight) {
	                shelf[j + 1] = shelf[j];
	                j--;
	            }

	            // Insert package at correct position
	            shelf[j + 1] = newPackage;
	        }
	    }
}
