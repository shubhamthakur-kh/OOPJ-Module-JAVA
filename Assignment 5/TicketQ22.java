/*
Problem 22: Ticket Booking Queue 
Use Case: Manage customer service in a ticket booking system. 
Requirements: 
● Queue customers for service 
● Serve customers in FIFO order 
● Display current queue status 
Sample Input: 
Queue: "Amit", "Priya", "Rohan" 
Serve: 1 customer 
Expected Output: 
Serving: Amit, Queue: Priya, Rohan
*/
import java.util.*;
class TicketQ22{
	public static void main(String args[]){
		Queue<String> q1 = new LinkedList<>();
		
		q1.add("Amit");
		q1.add("Priya");
		q1.add("Rohan");
		
		System.out.print("Queue : " +q1 + " ");
		
		if(!q1.isEmpty()){
			
			System.out.print("Serve: " +q1.poll());
		}
		System.out.print(" " + "Queue: " +q1);
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java TicketQ22
Queue : [Amit, Priya, Rohan] Serve: Amit Queue: [Priya, Rohan]
*/