/*
Problem 23: Employee Age Management 
Scenario: An HR system stores employee ages in a database. The system needs to convert primitive int 
values to Integer objects for database storage and collection operations. 
Task: Demonstrate autoboxing by converting primitive int to Integer object. 
Sample Input: 
30 
Expected Output: 
Integer object: 30
*/
class EmployeeAgeAutoBox{
	public static void main(String args[]){
		int age = 30 ;
		
		Integer age1 = age; //autobox 
		
		System.out.println("Integer object: " +age1);
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac EmployeeAgeAutoBox.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java EmployeeAgeAutoBox
Integer object: 30
*/