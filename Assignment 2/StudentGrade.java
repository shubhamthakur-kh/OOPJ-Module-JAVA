/*
Problem 11: Student Grade Calculator 
Scenario: 
Extend previous problem. Add method calculateGrade() which returns: 
● "A" if marks ≥ 80 
● "B" if marks ≥ 60 
● "C" if marks ≥ 40 
● "Fail" otherwise 
● Create 2 students, print marks and grades. 
*/
class StudentGrade {
    int rollNo;
    String name;
    int marks;

    StudentGrade(int rollNo, String name, int marks) {
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

    String calculateGrade() {
        if (marks >= 80) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 40) return "C";
        else return "Fail";
    }

    void showDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name +
                           ", Marks: " + marks + ", Grade: " + calculateGrade());
    }
	
    public static void main(String[] args) {
        StudentGrade s1 = new StudentGrade(101, "Anjali", 85);
        StudentGrade s2 = new StudentGrade(102, "Vikram", 58);

        s1.showDetails();
        s2.showDetails(); 
    }
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>java StudentGrade
Roll No: 101, Name: Anjali, Marks: 85, Grade: A
Roll No: 102, Name: Vikram, Marks: 58, Grade: C
*/

