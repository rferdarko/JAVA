package libapp;

public class Book {        // Book Class
    private String isbn;   //  ISBN
    private String title;  // Title
    private String genre;  // Genre
    private String description; // Description
    private String author; // Author


    public Book(String isbn, String title, String genre, String description, String author) { // constructor
        // constructor sets the this.<field> to the Book(parameters)

        this.isbn = isbn;               // constructor isbn field
        //        this.title = title;             // constructor title field
        this.genre = genre;             // constructor genre field
        this.description = description; // constructor description field
        this.author = author;           // constructor author field
    }

    // We need Getter methods to search through the books

    public String getIsbn() {  // Get ISBN
        return isbn; // return value isbn
    }

    public String getTitle() {  // Get Title
        return title; // return value title
    }

    public String getGenre() {  // Get Genre
        return genre; // return value genre
    }

    public String getDescription() {  // Get Description
        return description; // return value description
    }

    public String getAuthor() {  // Get Author
        return author;  // return value author
    }
}

