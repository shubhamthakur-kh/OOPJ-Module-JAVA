/*
Problem 2: Lab Access Queue System 
Use Case: A computer lab needs to manage students waiting for access using a first-come-first-served 
system. 
Requirements: 
● Students join the queue for lab access 
● Process students in FIFO order 
● Display remaining queue 
Sample Input: 
Enqueue: "Amit", "Priya", "Rohan" 
Dequeue: 1 student 
Expected Output: 
Queue: Priya, Rohan
*/
import java.util.*;

class LabStudentQ2{
	public static void main(String args[]){
		
		Queue <String> q1 = new LinkedList<>();
		
		// adding students
		q1.add("Amit");
		q1.add("Priya");
		q1.add("Rohan");
		
		// dequeue students
		q1.poll(); 
		
		// display
		System.out.print("Queue: ");
		for(String student : q1){
			System.out.print(student + " ");
		}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java LabStudentQ2
Queue: Priya Rohan
*/