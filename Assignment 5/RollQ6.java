/*
Problem 6: Unique Roll Number Validator 
Use Case: A registration system must ensure no duplicate roll numbers are assigned. 
Requirements: 
● Accept roll numbers for registration 
● Automatically remove duplicates 
● Display unique roll numbers 
Sample Input: 
Roll numbers: 101, 102, 101, 103 
Expected Output: 
Unique Roll Numbers: 101, 102, 103
*/
import java.util.*;

class RollQ6{
	public static void main(String args[]){
		
		Set<Integer> s1 = new LinkedHashSet<>();
		
		s1.add(101);
		s1.add(102);
		s1.add(101);
		s1.add(103);
		
		System.out.println("Unique Roll Numbers: " +s1);
		
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java RollQ6
Unique Roll Numbers: [101, 102, 103]
*/