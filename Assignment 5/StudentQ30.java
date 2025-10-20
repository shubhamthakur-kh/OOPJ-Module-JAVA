/*
Problem 30: Grade-Based Student Filter 
Use Case: Filter students based on minimum grade requirements. 
Requirements: 
● Store student objects with grades 
● Remove students below grade B 
● Display filtered results 
Sample Input: 
Students: ("Amit", "A"), ("Priya", "C"), ("Rohan", "B") 
Filter: Grade >= B 
Expected Output: 
Qualified Students: Amit:A, Rohan:B
*/

import java.util.*;
class Student{
	private String name;
	private String grade;
	
	public Student(String name, String grade){
		this.name = name;
		this.grade = grade;
	}
	
	public String getName(){
		return name;
	}
	
	public String getGrade(){
		return grade;
	}
	
	public String toString(){
		return name + ":" + grade ;
	}
}

public class StudentQ30{
	public static void main(String args[]){
		
		List<Student> std = new ArrayList<>();
		
		std.add(new Student("Amit", "A"));
		std.add(new Student("Priya", "C"));
		std.add(new Student("Rohan", "B"));
		
		Iterator<Student> it = std.iterator();
		while(it.hasNext()){
			Student s = it.next();
			if(s.getGrade().compareTo("B") > 0){
				it.remove();
			}
		}
		
		System.out.print("Qualified Students: ");
		for(Student s : std){
			System.out.print(s + " ");
		}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java StudentQ30
Qualified Students: Amit:A Rohan:B
*/