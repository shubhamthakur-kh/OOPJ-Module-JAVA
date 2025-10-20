/*
Problem 7: Student List 
Scenario: A school management system tries to load a student list from a file at the beginning of each 
semester. Sometimes the file might not exist or be corrupted. 
Task: Simulate file reading operation and handle FileNotFoundException. 
Sample Input: 
student_list.txt 
Expected Output: 
File not found
*/
import java.io.*;
import java.util.Scanner;
class StudFileNotFound{
	public static void main(String args[]) throws FileNotFoundException{
		try{
		File f = new File("student_list.txt");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
	}catch(FileNotFoundException e){
		System.out.println("File not found");
	}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac StudFileNotFound.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java StudFileNotFound
File not found
*/