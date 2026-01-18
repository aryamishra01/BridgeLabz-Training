package com.day5.robowarehouse;

public class Package {

	    int weight;

	    Package(int weight) {
	        this.weight = weight;
	    }

	    @Override
	    public String toString() {
	        return weight + "kg";
	    }
}
