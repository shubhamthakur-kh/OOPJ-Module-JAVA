/*
Problem 24: Print Job Queue Manager 
Use Case: Manage print jobs in a shared printer system. 
Requirements: 
● Queue print jobs 
● Process jobs in order 
● Display job status 
Sample Input: 
Jobs: "Doc1", "Doc2", "Doc3" 
Process: 1 job 
Expected Output: 
Printing Doc1, Queue: Doc2, Doc3
*/
import java.util.*;
class PrintQ24{
	public static void main(String args[]){
		Queue<String> q1 = new LinkedList<>();
		
		q1.add("Doc1");
		q1.add("Doc2");
		q1.add("Doc3");
		
		if(!q1.isEmpty()){
			String job = q1.poll();
			System.out.print("Printing :" +job + " ");
		}
		System.out.print("Queue: ");
		for(String str : q1){
			System.out.print(str + ", ");
		}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java PrintQ24
Printing :Doc1 Queue: Doc2, Doc3,
*/