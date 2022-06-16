package libapp;

import java.util.ArrayList;

public class BookRepository {  // a Class to contain the books
    // a new arraylist of Book, meaning it can hold Book instances.
    // It's called books because it can hold multiple instances of books.
    // It's private because we don't want other classes accessing it directly
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
        // Create an instance of Book and assign the Book parameters
                // Adds book1 to the ArrayList
                books.add(new Book("83471", "The Dead of Night", "Horror", "NULL", "S.K. Eleton"));
                // Adds book2 to the ArrayList
                books.add(new Book("83443", "The Walking", "Horror", "NULL", "M.R. Bones"));
                 // Adds book3 to the ArrayList
                books.add(new Book("45466", "The Sea", "Adventure", "NULL", "I. Fish"));
    }

        public Book findByIsbn(String isbn){ // Method to find a book by ISBN and assign a String parameter isbn
            for (Book book : books) {  // for each to loop through the books
                if (book.getIsbn().equals(isbn)) { // if get isbn equals isbn
                    return book; // if they are equal then return the book

                }

            }return null; // If the search does not return a book, the return book will never run, therefore return null

        }


    }

