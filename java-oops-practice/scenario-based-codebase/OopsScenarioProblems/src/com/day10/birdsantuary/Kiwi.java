package com.day10.birdsantuary;

public class Kiwi extends Bird {

    public Kiwi(String name, String id) {
        super(name, "Kiwi", id);
    }

    public String getAbilities() {
        return "Neither Fly nor Swim";
    }
}
