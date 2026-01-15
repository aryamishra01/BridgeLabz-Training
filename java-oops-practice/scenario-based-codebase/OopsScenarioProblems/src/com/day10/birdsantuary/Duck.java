package com.day10.birdsantuary;

public class Duck extends Bird implements Flyable, Swimmable {

    public Duck(String name, String id) {
        super(name, "Duck", id);
    }

    public void fly() {
        System.out.println(getName() + " is flying short distance");
    }

    public void swim() {
        System.out.println(getName() + " is swimming in water");
    }

    public String getAbilities() {
        return "Fly and Swim";
    }
}

