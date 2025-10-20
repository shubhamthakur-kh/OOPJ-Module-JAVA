/*
Problem 1: Student Names Management System 
Use Case: A school administrator needs to maintain a list of student names for a class roster. 
Requirements: 
● Add student names to the roster 
● Display all students 
● Remove a student from the roster 
Sample Input: 
Add students: "Amit", "Priya", "Rohan" 
Remove student: "Priya" 
Expected Output: 
Students: Amit, Rohan
*/
import java.util.*;

public class StudentQ1 {

	public static void main(String[] args) {
		
		ArrayList<String> s1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		// adding students
		s1.add("Amit");
		s1.add("Priya");
		s1.add("Rohan");
		
		// removes priya
		s1.remove("Priya");
		// display students using for each loop
		System.out.print("Students:");
		for(String student : s1) {
			System.out.print(student + ",");
		}

	}

}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java StudentQ1
Students:Amit,Rohan,
*/