package com.day2.traincompanion;

class Compartment {
    String name;
    String service;   // Pantry, WiFi, General, etc.

    public Compartment(String name, String service) {
        this.name = name;
        this.service = service;
    }

    @Override
    public String toString() {
        return name + " [" + service + "]";
    }
}

