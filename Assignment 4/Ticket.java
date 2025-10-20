/*
Problem 18: Ticket Number Verification 
Scenario: A ticketing system generates verification codes by reversing ticket numbers for security 
purposes. 
Task: Use StringBuffer to create verification codes. 
Sample Input: 
12345 
Expected Output: 
54321 
*/
class Ticket{
	public static void main(String args[]){
		StringBuffer s1 = new StringBuffer("12345");
		
		s1.reverse();
		
		System.out.println(s1);
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac Ticket.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java Ticket
54321
*/