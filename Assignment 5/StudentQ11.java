/*
Problem 11: Student Grade Management 
Use Case: A teacher needs to map student names to their exam marks. 
Requirements: 
● Store student name and marks pairs 
● Retrieve marks by student name 
● Display all student-marks mappings 
Sample Input: 
Students and marks: "Amit" → 85, "Priya" → 92, "Rohan" → 78 
Expected Output: 
Grade Report: Amit:85, Priya:92, Rohan:78
*/
import java.util.*;
class StudentQ11{
	public static void main(String args[]){
		Map<String, Integer> m1 = new TreeMap<>();
		
		m1.put("Amit",85);
		m1.put("Priya",92);
		m1.put("Rohan",78);
		
		System.out.print("Grade Report: ");
		 m1.forEach((name, marks) ->
		System.out.print(name + " : " + marks+ "," ));
       
    }
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java StudentQ11
Grade Report: Amit : 85,Priya : 92,Rohan : 78,
*/