/*
Problem 7: Alphabetical Student Directory 
Use Case: A school wants to maintain student names in alphabetical order. 
Requirements: 
● Add student names 
● Automatically maintain alphabetical sorting 
● Display sorted name 
Sample Input: 
Students: "Rohan", "Amit", "Priya" 
Expected Output: 
Students: Amit, Priya, Rohan
*/
import java.util.*;

class StudentQ7{
	public static void main(String args[]){
		Set<String> s1 = new TreeSet<>();
		
		s1.add("Rohan");
		s1.add("Amit");
		s1.add("Priya");
		
		System.out.print("Students: ");
		for(String name : s1){
			System.out.print(name + " ");
		}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java StudentQ7
Students: Amit Priya Rohan
*/