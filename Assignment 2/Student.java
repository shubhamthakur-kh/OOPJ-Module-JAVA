/*
Problem 5: Student Marks Calculator 
Scenario: A school in Mumbai wants to calculate marks of students and also maintain total students in 
the class. 
Requirements: 
1. Create a class Student with instance variables: name (String), marks (int). 
2. Create static variable totalStudents to count total number of students. 
3. Constructor to initialize student details and increment totalStudents. 
4. Getter and Setter for marks. 
5. Method isPassed() returns true if marks >= 35, false otherwise. 
6. Static method showTotalStudents() prints total students. 
7. In main class, create 3 students, check if they passed, and show total students. 
Input Example: 
Student1: Name: "Rahul", Marks: 78 
Student2: Name: "Pooja", Marks: 34 
Student3: Name: "Amit", Marks: 65 
Expected Output: 
Student Rahul Passed? true 
Student Pooja Passed? false 
Student Amit Passed? true 
Total students: 3
*/

class Student {
    String name;
    int marks;


    static int totalStudents = 0;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        totalStudents++; 
    }

  
    int getMarks() {
        return marks;
    }

 
    void setMarks(int marks) {
        this.marks = marks;
    }

   
    boolean isPassed() {
        return marks >= 35;
    }

    static void showTotalStudents() {
        System.out.println("Total students: " + totalStudents);
    }

    String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Creating 3 student objects
        Student s1 = new Student("Rahul", 78);
        Student s2 = new Student("Pooja", 34);
        Student s3 = new Student("Amit", 65);

        // Display pass status
        System.out.println("Student " + s1.getName() + " Passed? " + s1.isPassed());
        System.out.println("Student " + s2.getName() + " Passed? " + s2.isPassed());
        System.out.println("Student " + s3.getName() + " Passed? " + s3.isPassed());

        // Show total students
        Student.showTotalStudents();
    }
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>javac Student.java
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>java Student
Student Rahul Passed? true
Student Pooja Passed? false
Student Amit Passed? true
Total students: 3
*/