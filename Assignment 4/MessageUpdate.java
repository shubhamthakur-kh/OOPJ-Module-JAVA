/*
Problem 19: Message Update System 
Scenario: A communication system needs to update message status from "Old Notice" to "Updated 
Notice" when information is refreshed. 
Task: Use StringBuffer to update message status. 
Sample Input: 
Original text: Old Notice 
Text to find: Old 
Replacement text: Updated 
Expected Output: 
Updated Notice
*/
class MessageUpdate{
	public static void main(String args[]){
		StringBuffer s1 = new StringBuffer("Old Notice");
		
		String toFind = "Old";
		int index = s1.indexOf(toFind);
		System.out.println(index);
		
		s1.replace(0,3, "Updated");
		
		System.out.println(s1);
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac MessageUpdate.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java MessageUpdate
Updated Notice
*/