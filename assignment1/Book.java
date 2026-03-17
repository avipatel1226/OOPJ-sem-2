/**
 * Assignment 1 - Library Book Management System
 * Student: Avi Patel
 * Student ID: 200627226
 */

public class Book {
    // Private fields for encapsulation
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    /*
     * Default constructor
     * Initializes book with default values
     */
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.isbn = "0000000000";
        this.available = true;
    }

    /**
     * Parameterized constructor
     * @param title   The title of the book
     * @param author  The author of the book
     * @param isbn    The ISBN of the book (10 or 13 digits)
     * @param available Availability status
     */
    public Book(String title, String author, String isbn, boolean available) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        this.available = available;
    }

    // Getters and setters with validation

    public String getTitle() { return title; }

    public void setTitle(String title) {
        if(title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            this.title = "Unknown";
            System.out.println("Invalid title entered. Defaulting to 'Unknown'.");
        }
    }

    public String getAuthor() { return author; }

    public void setAuthor(String author) {
        if(author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            this.author = "Unknown";
            System.out.println("Invalid author entered. Defaulting to 'Unknown'.");
        }
    }

    public String getIsbn() { return isbn; }

    public void setIsbn(String isbn) {
        if(isbn != null && (isbn.length() == 10 || isbn.length() == 13) && isbn.matches("\\d+")) {
            this.isbn = isbn;
        } else {
            this.isbn = "0000000000";
            System.out.println("Invalid ISBN entered. Defaulting to '0000000000'.");
        }
    }

    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) { this.available = available; }

    /**
     * Display book details in a readable format
     */
    public void displayInfo() {
        System.out.println("------------------------------");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}
