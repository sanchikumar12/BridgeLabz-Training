package com.constructor.level1;
// Parent Class
class Book {

    public String ISBN;        // public
    protected String title;    // protected
    private String author;     // private

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for private author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for private author
    public String getAuthor() {
        return author;
    }

    // Method to display details
    public void displayBookDetails() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println();
    }
}


// Subclass demonstrating protected access
class EBook extends Book {

    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        // Can access public ISBN and protected title
        System.out.println("E-Book ISBN   : " + ISBN);
        System.out.println("E-Book Title  : " + title);
        System.out.println("E-Book Author : " + getAuthor()); // private via getter
        System.out.println("File Size     : " + fileSize + " MB");
        System.out.println();
    }
}


// Driver Class
public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        b1.displayBookDetails();

        // Modify author using setter
        b1.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + b1.getAuthor());
        System.out.println();

        // EBook object
        EBook eb1 = new EBook("978-0134685991", "Effective Java (Digital)", "Joshua Bloch", 5.8);
        eb1.displayEBookDetails();
    }
}
