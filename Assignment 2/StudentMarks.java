/*
Problem 10: Student Marks Checker 
Scenario: 
Create a Student class with rollNo, name, and marks. 
● Use a parameterized constructor to initialize all fields. 
● Create a getter and setter for marks. 
● In main, create one student, update marks using setter, and print student details.
*/
class StudentMarks {
    int rollNo;
    String name;
    int marks;

    // Parameterized constructor
    StudentMarks(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    // Method to display student details
    void showDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
	
    public static void main(String[] args) {
        StudentMarks s1 = new StudentMarks(101, "Anjali", 45);
        s1.setMarks(55);
        s1.showDetails();
    }
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>javac StudentMarks.java
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>java StudentMarks
Roll No: 101, Name: Anjali, Marks: 55
*/
