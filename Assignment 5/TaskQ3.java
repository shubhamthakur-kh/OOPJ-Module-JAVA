/*
Problem 3: Daily Task Tracker 
Use Case: A student wants to track their daily tasks and mark completed ones. 
Requirements: 
● Add tasks to the list 
● Mark tasks as completed (remove them) 
● Display remaining tasks 
Sample Input: 
Add tasks: "Study Java", "Complete Assignment", "Exercise" 
Complete task: "Exercise" 
Expected Output: 
Remaining tasks: Study Java, Complete Assignment
*/
import java.util.*;

class TaskQ3{
	public static void main(String args[]){
		List<String> l1 = new ArrayList<>();
		
		l1.add("Study Java");
		l1.add("Complete Assignment");
		l1.add("Excercise");
		
		l1.remove("Excercise");
		
		System.out.println("Remaining tasks: " +l1);
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java TaskQ3
Remaining tasks: [Study Java, Complete Assignment]
*/