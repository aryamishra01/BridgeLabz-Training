package com.librarymanagementsystem;

//Builder pattern used to construct Book objects with optional fields
public class BookBuilder {

	 private String title;
	 private String author = "N/A";
	 private String edition = "N/A";
	 private String genre = "N/A";
	 private String publisher = "N/A";
	
	 public BookBuilder(String title) {
	     this.title = title;
	 }
	
	 public BookBuilder setAuthor(String author) {
	     this.author = author;
	     return this;
	 }
	
	 public BookBuilder setEdition(String edition) {
	     this.edition = edition;
	     return this;
	 }
	
	 public BookBuilder setGenre(String genre) {
	     this.genre = genre;
	     return this;
	 }
	
	 public BookBuilder setPublisher(String publisher) {
	     this.publisher = publisher;
	     return this;
	 }
	
	 // Builds final Book object
	 public Book build() {
	     return new Book(title, author, edition, genre, publisher);
	 }
}

