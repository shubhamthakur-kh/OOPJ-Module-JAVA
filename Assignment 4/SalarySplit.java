/*
 
Problem 1: Salary Split 
Scenario: You are developing a payroll system for a company. The HR department wants to distribute a 
bonus equally among employees in a department. However, sometimes a department might have zero 
employees due to restructuring. 
 
Task: Create a method that divides a bonus amount among employees and handles the case when the 
number of employees is zero. 
 
Sample Input: 
10000 
0 
 
Expected Output: 
Error: Division by zero not allowed
*/

class SalarySplit{
	int salary = 10000;
	int employees = 0;
	void bonus(){
		try{
			int result = salary / employees;
		}catch(ArithmeticException e){
			System.out.println("Error: Division by zero not allowed ");
		}
	}
	public static void main(String args[]){
		SalarySplit s1 = new SalarySplit();
		s1.bonus();
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac SalarySplit.java
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java SalarySplit
Error: Division by zero not allowed
*/