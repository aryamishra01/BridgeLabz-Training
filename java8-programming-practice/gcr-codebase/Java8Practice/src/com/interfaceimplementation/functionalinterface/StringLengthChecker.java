package com.interfaceimplementation.functionalinterface;

import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        String message = "Java 8 Functional Interfaces";

        // Function using lambda
        Function<String, Integer> lengthFinder = msg -> msg.length();

        int length = lengthFinder.apply(message);

        if (length > 20) {
            System.out.println("Message exceeds character limit");
        } else {
            System.out.println("Message is within limit");
        }
    }
}

