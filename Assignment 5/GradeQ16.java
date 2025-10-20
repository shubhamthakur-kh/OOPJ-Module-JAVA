/*
Problem 16: Grade-Based Student Filter 
Use Case: Remove students with failing grades from the honor roll. 
Requirements: 
● Store student grades in a map 
● Remove students with marks below 60 
● Display remaining student 
Sample Input: 
Student grades: "Amit" → 85, "Priya" → 52, "Rohan" → 78 
Filter threshold: 60 
Expected Output: 
Honor Roll: Amit:85, Rohan:78
*/
import java.util.*;
class GradeQ16{
	public static void main(String args[]){
		
		Map<String, Integer> m1 = new HashMap<>();
		
		m1.put("Amit",85);
		m1.put("Priya",52);
		m1.put("Rohan",78);
		
		m1.entrySet().removeIf(entry -> entry.getValue() < 60);
		
		System.out.print("Honor Roll: ");
		m1.forEach((name, marks) -> 
		System.out.print(name + ":" + marks + ", "));
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java GradeQ16
Honor Roll: Amit:85, Rohan:78,
*/