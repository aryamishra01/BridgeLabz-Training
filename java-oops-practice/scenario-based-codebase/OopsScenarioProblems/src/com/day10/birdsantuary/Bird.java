package com.day10.birdsantuary;

@DeveloperInfo(name = "EcoWing Team", version = "1.0")
public abstract class Bird {

    private String name;
    private String species;
    private String id;

    public Bird(String name, String species, String id) {
        this.name = name;
        this.species = species;
        this.id = id;
    }

    public void eat() {
        System.out.println(name + " is eating food");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public abstract String getAbilities();
}

