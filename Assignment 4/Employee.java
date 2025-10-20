/*
Problem 4: Employee Data 
Scenario: An HR system needs to calculate hourly wage by dividing an employee's salary by working 
hours. The system must handle both invalid employee indices and division by zero. 
 
Task: Create a method with nested try-catch blocks to handle multiple exception scenarios. 
 
Sample Input: 
2 
5000 6000 
0 
5 
 
Expected Output: 
Division by zero 
or 
Invalid index 
*/
import java.util.*;
class Employee{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int emp = sc.nextInt();
		int sal[] = new int[emp];
		
		for(int i=0;i<emp;i++){
			sal[i] = sc.nextInt();
		}
		int workHr = sc.nextInt();
		int index = sc.nextInt();
		
		try{
			int salary = sal[index];
			int wage = salary / workHr;
			System.out.println("Hourly wage: " +wage);
		}catch(ArithmeticException e){
			System.out.println("Division by zero");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index");
		}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java Employee
2
5000 6000
0
5
Invalid index

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java Employee
2
5000 6000
0
1
Division by zero
*/