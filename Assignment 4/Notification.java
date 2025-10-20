/*
Problem 11: Notification Update 
Scenario: A university notification system needs to update announcements when exam schedules change. 
The system should efficiently replace old information with new information. 
Task: Use StringBuilder to update notification messages. 
Sample Input: 
Original text: Exam postponed 
Text to find: postponed 
Replacement Text: rescheduled 
Expected Output: 
Exam rescheduled 
*/
class Notification{
	public static void main(String args[]){
		
		StringBuilder m1 = new StringBuilder("Exam postponed");
		
		String toFind = "postponed";
		
        int startIndex = m1.indexOf(toFind);
		System.out.println(startIndex);
		
		String replacement = "rescheduled";
		m1.replace(5,14,replacement);
		System.out.println(m1);
	}	
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac Notification.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java Notification
Exam rescheduled
*/