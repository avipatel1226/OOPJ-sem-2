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
