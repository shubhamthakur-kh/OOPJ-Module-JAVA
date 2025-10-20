/*

30. Library Management System 
Scenario: Manage books and library members with borrowing functionality. 
Problem Statement: 
● Class Book → private variables: bookId, title, author (Encapsulation) 
● Abstract Class LibraryMember → instance variables: memberId, name 
○ Abstract method borrowBook(Book book) 
● Class StudentMember extends LibraryMember → limit 3 books 
● Class FacultyMember extends LibraryMember → limit 5 books 
● Interface Notifyable → method sendNotification(String message) → notify members about 
overdue books 
● In main(), create 1 student and 1 faculty, borrow books, send notifications 
Sample Input: 
Student → borrow 2 books 
Faculty → borrow 4 books 
Sample Output: 
StudentMember Amit borrowed 2 books 
FacultyMember Prof. Singh borrowed 4 books 
Notification sent to Amit: Return books within 7 days 
Notification sent to Prof. Singh: Return books within 14 days


*/

interface Notifyable {
    void sendNotification(String message);
}

class Book {
    private int bookId;
    private String title;
    private String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
}

abstract class LibraryMember {
    String name;
    int memberId;

    LibraryMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    abstract void borrowBook(Book book);
}

class StudentMember extends LibraryMember implements Notifyable {
    int booksBorrowed = 0;
    final int limit = 3;

    StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    void borrowBook(Book book) {
        if (booksBorrowed < limit) booksBorrowed++;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}

class FacultyMember extends LibraryMember implements Notifyable {
    int booksBorrowed = 0;
    final int limit = 5;

    FacultyMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    void borrowBook(Book book) {
        if (booksBorrowed < limit) booksBorrowed++;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        StudentMember student = new StudentMember(101, "Amit");
        FacultyMember faculty = new FacultyMember(201, "Prof. Singh");

        Book b1 = new Book(1, "Math", "Author1");
        Book b2 = new Book(2, "Physics", "Author2");
        Book b3 = new Book(3, "Chemistry", "Author3");
        Book b4 = new Book(4, "Biology", "Author4");

        // Borrow books
        student.borrowBook(b1);
        student.borrowBook(b2);

        faculty.borrowBook(b1);
        faculty.borrowBook(b2);
        faculty.borrowBook(b3);
        faculty.borrowBook(b4);

        System.out.println("StudentMember " + student.name + " borrowed " + student.booksBorrowed + " books");
        System.out.println("FacultyMember " + faculty.name + " borrowed " + faculty.booksBorrowed + " books");

        // Send notifications
        student.sendNotification("Return books within 7 days");
        faculty.sendNotification("Return books within 14 days");
    }
}

/*

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac LibraryTest.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java LibraryTest
StudentMember Amit borrowed 2 books
FacultyMember Prof. Singh borrowed 4 books
Notification sent to Amit: Return books within 7 days
Notification sent to Prof. Singh: Return books within 14 days

/