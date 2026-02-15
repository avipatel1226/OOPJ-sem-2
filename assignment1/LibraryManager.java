// LibraryManager.java
// Main program for Library Book Management System
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        int choice;

        do {
            // Menu
            System.out.println("\n=== Library Book Management System ===");
            System.out.println("1. Add a new book");
            System.out.println("2. Display all books");
            System.out.println("3. Display all available books");
            System.out.println("4. Search books by author");
            System.out.println("5. Check out a book");
            System.out.println("6. Return a book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a number between 1-7: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch(choice) {
                case 1:
                    // Add a new book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN (10 or 13 digits): ");
                    String isbn = scanner.nextLine();
                    Book newBook = new Book(title, author, isbn, true);
                    library.add(newBook);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    // Display all books (sorted by title)
                    if(library.isEmpty()) {
                        System.out.println("No books in the library.");
                    } else {
                        library.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle())); // optional sorting
                        int availableCount = 0;
                        int checkedOutCount = 0;
                        for(Book book : library) {
                            book.displayInfo();
                            if(book.isAvailable()) availableCount++;
                            else checkedOutCount++;
                        }
                        System.out.println("\nAvailable Books: " + availableCount);
                        System.out.println("Checked Out Books: " + checkedOutCount);
                    }
                    break;

                case 3:
                    // Display available books only
                    boolean anyAvailable = false;
                    for(Book book : library) {
                        if(book.isAvailable()) {
                            book.displayInfo();
                            anyAvailable = true;
                        }
                    }
                    if(!anyAvailable) System.out.println("No available books.");
                    break;

                case 4:
                    // Search books by author
                    System.out.print("Enter author name to search: ");
                    String searchAuthor = scanner.nextLine();
                    boolean found = false;
                    for(Book book : library) {
                        if(book.getAuthor().equalsIgnoreCase(searchAuthor)) {
                            book.displayInfo();
                            found = true;
                        }
                    }
                    if(!found) System.out.println("No books found by " + searchAuthor);
                    break;

                case 5:
                    // Check out a book
                    System.out.print("Enter ISBN of book to check out: ");
                    String checkoutIsbn = scanner.nextLine();
                    boolean checkedOut = false;
                    for(Book book : library) {
                        if(book.getIsbn().equals(checkoutIsbn)) {
                            if(book.isAvailable()) {
                                book.setAvailable(false);
                                System.out.println("Book checked out successfully!");
                            } else {
                                System.out.println("Book is already checked out.");
                            }
                            checkedOut = true;
                            break;
                        }
                    }
                    if(!checkedOut) System.out.println("Book not found.");
                    break;

                case 6:
                    // Return a book
                    System.out.print("Enter ISBN of book to return: ");
                    String returnIsbn = scanner.nextLine();
                    boolean returned = false;
                    for(Book book : library) {
                        if(book.getIsbn().equals(returnIsbn)) {
                            if(!book.isAvailable()) {
                                book.setAvailable(true);
                                System.out.println("Book returned successfully!");
                            } else {
                                System.out.println("Book is already available.");
                            }
                            returned = true;
                            break;
                        }
                    }
                    if(!returned) System.out.println("Book not found.");
                    break;

                case 7:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while(choice != 7);

        scanner.close();
    }
}
