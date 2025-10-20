/*
Problem 3: Library Book Tracker 
Scenario: A library in Delhi wants to track how many books are issued in total and details of each book. 
Requirements: 
1. Create a Book class with instance variables: title (String), author (String), issued (boolean). 
2. Create static variable totalIssuedBooks to keep track of the total number of books issued. 
3. Create a constructor to initialize the book details. 
4. Create getters and setters for all instance variables. 
5. Create a static method showTotalIssued() to print total issued books. 
6. Write a main class to create 3 books, issue some of them (issued = true), and show total issued 
books. 
Input Example: 
Book1: "Harry Potter", Author: "J.K. Rowling", Issued: true 
Book2: "Five Point Someone", Author: "Chetan Bhagat", Issued: false 
Book3: "Rich Dad Poor Dad", Author: "Robert Kiyosaki", Issued: true 
Expected Output: 
Book1 issued? true 
Book2 issued? false 
Book3 issued? true 
Total books issued: 2 
*/

class Book{
	String title;
	String author;
	boolean issued;
	
	static int totalIssuedBooks=0;
	
	Book(String title,String author,boolean issued){
		this.title = title;
		this.author = author;
		this.issued = issued;
		if(issued){
			totalIssuedBooks++;
		}
	}
	
	String getTitle(){
		return title;
	}
	String getAuthor(){
		return author;
	}
	boolean isIssued(){
		return issued;
	}
	
	void setTitle(String title){
		this.title = title;
	}
	void setAuthor(String author){
		this.author = author;
	}
	void setIssued(boolean issued){
		if(this.issued != issued){
			if(issued){
				totalIssuedBooks++;
			}else {
				totalIssuedBooks--;
			}
		}
		this.issued = issued;
	}
	static void showTotalIssued(){
		System.out.println("Total Books Issued: " + totalIssuedBooks);
	}

public static void main(String[] args){
	Book book1 = new Book("Two States", "Chetan Bhagat", true);
	Book book2 = new Book("Harry Potter", "J.K Rowling", false);
	Book book3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki",true);
	
	System.out.println("Book1 issued? " + book1.isIssued());
	System.out.println("Book1 issued? " + book2.isIssued());
	System.out.println("Book3 issued? " + book3.isIssued());
	
	Book.showTotalIssued();
}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>javac Book.java
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>java Book
Book1 issued? true
Book1 issued? false
Book3 issued? true
Total Books Issued: 2
*/