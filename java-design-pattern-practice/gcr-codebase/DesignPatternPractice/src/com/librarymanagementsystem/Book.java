package com.librarymanagementsystem;

//Book entity class
public class Book {

 private String title;
 private String author;
 private String edition;
 private String genre;
 private String publisher;

 public Book(String title, String author, String edition, String genre, String publisher) {
     this.title = title;
     this.author = author;
     this.edition = edition;
     this.genre = genre;
     this.publisher = publisher;
 }

 public String getTitle() {
     return title;
 }

 // Display book details
 public String toString() {
     return "Title: " + title +
             ", Author: " + author +
             ", Edition: " + edition +
             ", Genre: " + genre +
             ", Publisher: " + publisher;
 }
}
