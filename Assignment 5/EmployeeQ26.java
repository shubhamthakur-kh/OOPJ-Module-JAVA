/*
Problem 26: Employee Management System 
Use Case: Manage employee information including name and salary. 
Requirements: 
● Create Employee objects with name and salary 
● Store employees in a collection 
● Display employee information 
Sample Input: 
Employees: Employee("Amit", 50000), Employee("Priya", 60000) 
Expected Output: 
Employee List: Amit:50000, Priya:60000 
*/
import java.util.*;
class Employee{
	private String name;
	private int salary;
	
	// Constructor
	public Employee(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	
	//Getter 
	public String getName(){
		return name;
	}
	
	public int salary(){
		return salary;
	}
	
	//@Override toString to display
	@Override
	public String toString(){
		return name + ":" + salary;
	}
}

public class EmployeeQ26{
	public static void main(String args[]){
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee("Amit", 50000));
		emp.add(new Employee("Priya", 60000));
		
		
		System.out.print("Employee List: ");
		for(Employee em : emp){
			System.out.print(em + ", ");
		}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java EmployeeQ26
Employee List: Amit:50000, Priya:60000,
*/