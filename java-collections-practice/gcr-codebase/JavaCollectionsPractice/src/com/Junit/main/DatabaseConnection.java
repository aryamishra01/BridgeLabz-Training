package com.Junit.main;

public class DatabaseConnection {

    private boolean connected = false;

    // Simulate DB connection
    public void connect() {
        connected = true;
        System.out.println("Database connected");
    }

    // Simulate DB disconnection
    public void disconnect() {
        connected = false;
        System.out.println("Database disconnected");
    }

    // To check connection status
    public boolean isConnected() {
        return connected;
    }
}

