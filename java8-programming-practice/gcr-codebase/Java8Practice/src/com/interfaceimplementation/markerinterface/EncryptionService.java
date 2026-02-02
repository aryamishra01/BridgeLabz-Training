package com.interfaceimplementation.markerinterface;

interface SensitiveData {
    // marker interface
}

class UserCredentials implements SensitiveData {
    String username;
    String password;

    public UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class EncryptionService {

	public static void process(Object obj) {
		
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data...");
        } else {
            System.out.println("No encryption required");
        }
    }

    public static void main(String[] args) {
        UserCredentials user = new UserCredentials("arya", "12345");
        String normalData = "Hello";

        process(user);
        process(normalData);
    }
}
