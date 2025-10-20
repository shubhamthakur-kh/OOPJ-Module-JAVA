/*
Problem 27: Employee Salary Sorting 
Use Case: Sort employees by salary for payroll processing. 
Requirements: 
● Store employee objects 
● Sort by salary in ascending order 
● Display sorted employee list 
Sample Input: 
Employees: ("Amit", 50000), ("Priya", 60000), ("Rohan", 45000) 
Expected Output: 
Sorted by salary: Rohan:45000, Amit:50000, Priya:60000
*/
import java.util.*;
class Employee{
	private String name;
	private int salary;
	
	public Employee(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String getName(){
		return name;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public String toString(){
		return name + ":" + salary;
	}
}

public class EmployeeQ27{
	public static void main(String args[]){
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Amit", 50000));
		emp.add(new Employee("Priya", 60000));
		emp.add(new Employee("Rohan", 45000));
		
		
		Collections.sort(emp, Comparator.comparingInt(Employee::getSalary));
		
		System.out.print("Sorted by salary: ");
		for(Employee emp2 : emp){
			System.out.print(emp2+ " ");
		}
	}
}
/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java EmployeeQ27
Sorted by salary: Rohan:45000 Amit:50000 Priya:60000
*/