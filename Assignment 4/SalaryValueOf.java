/*
Problem 26: Salary Storage 
Scenario: A financial system needs to convert primitive double salary values to Double objects for 
storage in collections and database operations. 
Task: Use valueOf method to convert primitives to wrapper objects. 
Sample Input: 
45000.5 
Expected Output: 
Double object: 45000.5
*/
class SalaryValueOf{
	public static void main(String args[]){
		
		double salary = 45000.5;
		
		double result = Double.valueOf(salary);
		
		System.out.println("Double object: " +result);
	}
}
/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac SalaryValueOf.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java SalaryValueOf
Double object: 45000.5
*/