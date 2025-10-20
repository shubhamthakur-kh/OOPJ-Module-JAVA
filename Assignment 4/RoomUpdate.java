/*
Problem 16: Room Allocation Update 
Scenario: A facility management system assigns rooms to different activities and needs to insert building 
information into existing room numbers. 
Task: Use StringBuffer to update room allocation information. 
Sample Input: 
Original text: 101 
Text to insert: New Building  
Insert index: 0 
Expected Output: 
New Building 101
*/
class RoomUpdate{
	public static void main(String args[]){
		StringBuffer s1 = new StringBuffer("101");
		
		s1.insert(0,"New Building ");
		
		System.out.println(s1);
	}
}

/*
:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac RoomUpdate.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java RoomUpdate
New Building 101
*/