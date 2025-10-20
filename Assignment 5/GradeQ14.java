/*
Problem 14: Grade Update System 
Use Case: Update a student's marks in the grading system. 
Requirements: 
● Store student grades 
● Update existing student's marks 
● Display updated information 
Sample Input: 
Initial: "Rohan" → 78 
Update: "Rohan" → 88 
Expected Output: 
Updated Grade: Rohan:88 
*/
import java.util.*;
class GradeQ14{
	public static void main(String args[]){
		
		Map<String, Integer> m1 = new HashMap<>();
		
		m1.put("Rohan",78);
		
		m1.put("Rohan",88);  //Overrites existing
		
		System.out.println("Updated Grade: Rohan:" +m1.get("Rohan"));
		
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java GradeQ14
Updated Grade: Rohan:88
*/