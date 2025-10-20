/*
Problem 8: Course Registration System 
Use Case: A student registers for courses, ensuring no duplicate course codes. 
Requirements: 
● Register for courses using course codes 
● Prevent duplicate registrations 
● Display registered courses 
Sample Input: 
Course codes: "CS101", "MA101", "CS101" 
Expected Output: 
Registered Courses: CS101, MA101
*/
import java.util.*;

class CourseQ8{
	public static void main(String args[]){
		Set<String> s1 = new LinkedHashSet<>();
		
		s1.add("CS101");
		s1.add("MA101");
		s1.add("CS101");
		
		System.out.print("Registered Courses: ");
		for(String str : s1){
			System.out.print(str + " ");
		}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java CourseQ8
Registered Courses: CS101 MA101
*/