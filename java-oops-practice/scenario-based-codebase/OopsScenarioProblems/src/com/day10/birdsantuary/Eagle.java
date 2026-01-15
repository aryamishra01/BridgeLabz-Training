package com.day10.birdsantuary;

public class Eagle extends Bird implements Flyable {

    public Eagle(String name, String id) {
        super(name, "Eagle", id);
    }

    public void fly() {
        System.out.println(getName() + " is flying high");
    }

    public String getAbilities() {
        return "Fly";
    }
}

