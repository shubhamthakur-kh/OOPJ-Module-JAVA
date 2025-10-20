/*
Problem 19: Grade Report Generator 
Use Case: Display all student grades using proper iteration techniques. 
Requirements: 
● Iterate through student-grade mappings 
● Display formatted grade report 
● Use Iterator pattern 
Sample Input: 
Student grades: "Amit" → 85, "Priya" → 92 
Expected Output: 
Grade Report: Amit:85, Priya:92
*/
import java.util.*;
class GradeQ19{
	public static void main(String args[]){
		Map<String, Integer> m1 = new HashMap<>();
		
		m1.put("Amit",85);
		m1.put("Priya",92);
		
		Iterator<Map.Entry<String, Integer>> it = m1.entrySet().iterator();
		
		System.out.print("Grade Report: ");
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			System.out.print(entry.getKey() + ":" + entry.getValue());
			if(it.hasNext()) {
				System.out.print(", ");
			}
		}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java GradeQ19
Grade Report: Priya:92, Amit:85
*/