/*
Problem 10: Greeting Message 
Scenario: A learning management system generates personalized greeting messages for students. The 
system starts with a basic greeting and adds course-specific information. 
Task: Use StringBuilder to create a personalized greeting message. 
Sample Input: 
Initial Text: Hello 
Text to insert: CDAC  
Insert Index: 6 
Text to append: Java Student 
Expected Output: 
Hello CDAC Java Student
*/
class Greeting {
	public static void main(String args[]){
		StringBuilder m1 = new StringBuilder("Hello ");
		
		m1.insert(6, "CDAC ");
		
		m1.append("Java Student");
		
		System.out.println(m1.toString());
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac Greeting.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java Greeting
Hello CDAC Java Student
*/