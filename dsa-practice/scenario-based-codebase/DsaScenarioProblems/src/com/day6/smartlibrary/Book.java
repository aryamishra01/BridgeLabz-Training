package com.day6.smartlibrary;

public class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

