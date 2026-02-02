package com.interfaceimplementation.functionalinterface;

import java.util.function.Predicate;

public class TemperatureAlert {

    public static void main(String[] args) {

        double currentTemp = 39.5;

        // Predicate using lambda
        Predicate<Double> highTempAlert = temp -> temp > 38.0;

        if (highTempAlert.test(currentTemp)) {
        	
            System.out.println("High Temperature Alert!");
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}
