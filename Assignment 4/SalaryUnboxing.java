/*
Problem 24: Salary Calculation 
Scenario: A payroll system retrieves employee ages from a database as Integer objects but needs 
primitive int values for mathematical calculations. 
Task: Demonstrate unboxing by extracting primitive values from wrapper objects. 
Sample Input: 
25 
Expected Output: 
int value: 25
*/
class SalaryUnboxing{
	public static void main(String args[]){
		
		Integer age = 25;
		
		int age1 = age; // unboxing Integer -> int
		
		System.out.println("int value:" +age1);
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac SalaryUnboxing.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java SalaryUnboxing
int value:25
*/