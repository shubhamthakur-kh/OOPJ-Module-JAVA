/*
Problem 12: Remove Extra Text 
Scenario: An automated message system sometimes adds extra text that needs to be removed before 
sending messages to students. 
Task: Use StringBuilder to clean up message content. 
Sample Input: 
Original Text: Please read - Do not disturb 
Exact substring to delete: - Do not disturb 
Expected Output: 
Please read
*/
class MessageRemove{
	public static void main(String args[]){
		
		StringBuilder m1 = new StringBuilder("Please read - Do not disturb");
		
		String delete = "- Do not disturb";
		
		int index = m1.indexOf(delete);
		
		m1.delete(index, index + delete.length());
		
		System.out.println(m1);
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac MessageRemove.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java MessageRemove
Please read
*/