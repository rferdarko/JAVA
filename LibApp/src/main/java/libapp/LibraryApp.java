package libapp;

public class LibraryApp {     // LibraryApp Class is the Frontend of the product

    // new instance of BookRepository for LibraryApp to interact with
    private BookRepository bookRepo = new BookRepository(); // new BookRepository object

    // Method to search for book by ISBN
    public void searchByIsbn(String isbn) { // assign a String isbn to search for in parameters

        // Method will return a valid book or a NULL value so we assign it to a variable
        Book book = bookRepo.findByIsbn(isbn);
        System.out.printf("Searching for books with ISBN %s.\n", isbn); // prints searching for + ISBN number
        if (book != null) {  // if book is not equal to null this block will run
            System.out.printf("1 book found\n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor()); // Prints atatement and book information

        } else {  // This block will run if it is NULL
            System.out.printf("0 books found."); // Prints if no books are located
        }
        System.out.print("\n\n");  // prints new lines to create a gap between records

    }

}
