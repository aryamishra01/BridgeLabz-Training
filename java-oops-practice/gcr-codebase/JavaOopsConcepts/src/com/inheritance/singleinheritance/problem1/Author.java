package com.inheritance.singleinheritance.problem1;

public class Author extends Book {

    String name;
    String bio;

    public Author(String title, String publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Overriding display method of super class to child class 
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("\n*** Author Information ***");
        System.out.println("Name of Author : " + name);
        System.out.println("Bio : " + bio);
    }
}

