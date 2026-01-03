package com.encapsulation.problem5;

public abstract class LibraryItem {

    protected int itemId;
    protected String title;
    protected String author;

    // Encapsulated borrower data
    private String borrowerName;
    private boolean isAvailable = true;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID      : " + itemId);
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Loan Period  : " + getLoanDuration() + " days");
        System.out.println("Available    : " + (isAvailable ? "Yes" : "No"));
    }

    // Encapsulation
    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
        this.isAvailable = false;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void returnItem() {
        borrowerName = null;
        isAvailable = true;
        System.out.println("Item returned successfully.");
    }
}
