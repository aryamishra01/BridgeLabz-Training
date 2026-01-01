package com.inheritance.singleinheritance.problem1;

public class Book {

    public String title;
    public String publicationYear;

    Book(String title, String publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("*** Book Information ***");
        System.out.println("Title of book : " + title);
        System.out.println("Publication year : " + publicationYear);
    }
}

