/*
Problem 13: Student Registration Order Tracker 
Use Case: Maintain the order in which students registered for a course. 
Requirements: 
● Record registration order 
● Map student names to roll numbers 
● Preserve insertion order 
Sample Input: 
Registrations: "Amit" → 101, "Rohan" → 102, "Priya" → 103 
Expected Output: 
Registration Order: Amit:101, Rohan:102, Priya:103
*/
import java.util.*;
class StudentQ13{
	public static void main(String args[]){
		Map<String, Integer> m1 = new LinkedHashMap<>();
		
		m1.put("Amit",101);
		m1.put("Rohan",102);
		m1.put("Priya",103);
		
		System.out.print("Registration Order: ");
		m1.forEach((name,roll) ->
		System.out.print(name + ":" + roll + ", "));
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java StudentQ13
Registration Order: Amit:101, Rohan:102, Priya:103,
*/