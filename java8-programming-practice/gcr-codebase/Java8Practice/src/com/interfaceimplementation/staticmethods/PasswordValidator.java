package com.interfaceimplementation.staticmethods;

interface SecurityUtils {

    static boolean isStrongPassword(String password) {

        // Minimum 8 characters, at least one digit
        return password.length() >= 8 &&
               password.matches(".*\\d.*");
    }
}

public class PasswordValidator {

    public static void main(String[] args) {

        String password = "AryaMishra123";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}

