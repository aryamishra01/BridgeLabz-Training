package com.day1.bookshelf;

class Book {
    private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return title + " by " + author + " [ISBN: " + isbn + "]";
    }
}
