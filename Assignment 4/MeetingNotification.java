/*
Problem 15: Meeting Notification 
Scenario: A corporate meeting scheduler needs to build complete meeting notifications by adding time 
and location details to basic meeting announcements. 
Task: Use StringBuffer to create detailed meeting notifications. 
Sample Input: 
Base text: Meeting: 
Text to append: Friday at 5 PM 
Expected Output: 
Meeting: Friday at 5 PM 
*/
class MeetingNotification{
	public static void main(String args[]){
		StringBuffer s1 = new StringBuffer("Meeting");
		
		s1.append(" Friday at 5 PM");
		
		System.out.println(s1);
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac MeetingNotification.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java MeetingNotification
Meeting Friday at 5 PM
*/