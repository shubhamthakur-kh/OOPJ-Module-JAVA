/*
Problem 12: Attendance Tracking System 
Use Case: Track student attendance percentages in alphabetical order. 
Requirements: 
● Map student names to attendance percentages 
● Maintain alphabetical order of students 
● Display sorted attendance report 
Sample Input: 
Attendance: "Amit" → 90, "Rohan" → 85, "Priya" → 95 
Expected Output: 
Attendance Report: Amit:90, Priya:95, Rohan:85
*/
import java.util.*;
class AttendanceQ12{
	public static void main(String args[]){
		
		Map<String, Integer> m1 = new TreeMap<>();
		
		m1.put("Amit",90);
		m1.put("Rohan",85);
		m1.put("Priya",95);
		
		System.out.print("Attendance Report: ");
		m1.forEach((name, per) ->
			System.out.print(name + ":" + per + ","));
	}
	
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java AttendanceQ12
Attendance Report: AMit:90,Priya:95,Rohan:85,
*/