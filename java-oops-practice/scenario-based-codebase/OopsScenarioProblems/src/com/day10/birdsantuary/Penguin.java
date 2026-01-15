package com.day10.birdsantuary;

public class Penguin extends Bird implements Swimmable {

    public Penguin(String name, String id) {
        super(name, "Penguin", id);
    }

    public void swim() {
        System.out.println(getName() + " is swimming fast");
    }

    public String getAbilities() {
        return "Swim";
    }
}

