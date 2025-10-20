/*
Problem 17: Library Book Addition 
Scenario: 
Create Book class with bookId, title, author. 
● Constructor + Getters/Setters 
● Create Library class with libraryName and static totalBooks 
● Method addBook(Book b) → increments totalBooks 
● Method displayTotalBooks() → prints totalBooks 
● Add 2 books to library and display total books
*/
class Book2 {
    int bookId;
    String title;
    String author;

    Book2(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    int getBookId() { return bookId; }
    String getTitle() { return title; }
    String getAuthor() { return author; }
}

class Library {
    String libraryName;
    static int totalBooks = 0;

    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    void addBook(Book2 b) {
        totalBooks++;
        System.out.println("Book added: " + b.getTitle() + " by " + b.getAuthor());
    }

    void displayTotalBooks() {
        System.out.println("Total books in " + libraryName + ": " + totalBooks);
    }
}

public class Main {
    public static void main(String[] args) {
        Library lib = new Library("CDAC Library");

        Book2 b1 = new Book2(101, "Clean Code", "Robert C. Martin");
        Book2 b2 = new Book2(102, "Effective Java", "Joshua Bloch");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayTotalBooks();
    }
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>javac Main.java
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>java Main
Book added: Clean Code by Robert C. Martin
Book added: Effective Java by Joshua Bloch
Total books in CDAC Library: 2
*/