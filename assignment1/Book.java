// Book.java
// Represents a book in the library
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.isbn = "0000000000";
        this.available = true;
    }

    // Parameterized constructor
    public Book(String title, String author, String isbn, boolean available) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        this.available = available;
    }

    // Getters and Setters with validation
    public String getTitle() { return title; }
    public void setTitle(String title) {
        if(title != null && !title.trim().isEmpty()) this.title = title;
        else { this.title = "Unknown"; System.out.println("Invalid title"); }
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) {
        if(author != null && !author.trim().isEmpty()) this.author = author;
        else { this.author = "Unknown"; System.out.println("Invalid author"); }
    }
   public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) {
        if(isbn != null && (isbn.length() == 10 || isbn.length() == 13)) this.isbn = isbn;
        else { this.isbn = "0000000000"; System.out.println("Invalid ISBN"); }
    }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    // Display book details
    public void displayInfo() {
        System.out.println("------------------------------");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}
