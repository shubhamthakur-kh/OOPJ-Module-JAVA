/*
Problem 21: Text Editor Undo System 
Use Case: Implement undo functionality for a text editor. 
Requirements: 
● Track user actions in order 
● Implement undo operation (LIFO) 
● Display current action history 
Sample Input: 
Actions: "Type A", "Type B", "Delete" 
Operation: Undo last action 
Expected Output: 
Current actions: Type A, Type B
*/
import java.util.*;
class EditorQ21{
	public static void main(String args[]){
		Stack<String> s1 = new Stack<>();
		
		s1.push("Type A");
		s1.push("Type B");
		s1.push("Delete");
		
		System.out.println(s1);
		
		if(!s1.isEmpty()){
		String undo = s1.pop();
		System.out.println("Undone action:" +undo);
		}
		System.out.println("Current Actions: " +s1);
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java EditorQ21
[Type A, Type B, Delete]
Undone action:Delete
Current Actions: [Type A, Type B]
*/