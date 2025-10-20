/*
Problem 29: Student Record System 
Use Case: Maintain student records with name and grade information. 
Requirements: 
● Create Student objects with name and grade 
● Store in a collection 
● Display student records 
Sample Input: 
Students: Student("Amit", "A"), Student("Priya", "B") 
Expected Output: 
Student Records: Amit:A, Priya:B 
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
	   return name + ":" + grade;
   }
}

public class StudentQ29{
	public static void main(String args[]){
		
		List<Student> std = new ArrayList<>();
		
		std.add(new Student("Amit", "A"));
		std.add(new Student("Priya", "B"));
		
		System.out.print("Student Records: ");
		for(Student s : std){
			System.out.print(s + " ");
		}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java StudentQ29
Student Records: Amit:A Priya:B
*/