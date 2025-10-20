import java.util.Scanner;
class GradePMQ48{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        String grade;

        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 85) {
            grade = "A";
        } else if (marks >= 76) {
            grade = "A-";
        } else if (marks >= 66) {
            grade = "B+";
        } else if (marks >= 51) {
            grade = "B";
        } else if (marks >= 36) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("Grade: " + grade);
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac GradePMQ48.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java GradePMQ48
Enter marks: 78
Grade: A-
*/