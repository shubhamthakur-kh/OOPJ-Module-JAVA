/*Problem 23: Browser History Management 
Use Case: Maintain browser history with back functionality. 
Requirements: 
● Store visited pages 
● Implement back navigation (LIFO) 
● Display current history 
Sample Input: 
Pages visited: "Google", "YouTube", "GFG" 
Action: Back (1 page) 
Expected Output: 
Current history: Google, YouTube
*/
import java.util.*;
class BrowserQ23{
	public static void main(String args[]){
		
		Stack<String> s1 = new Stack<>();
		
		s1.push("Google");
		s1.push("Youtube");
		s1.push("GFG");
		
		if(!s1.isEmpty()){
			s1.pop();
		}
		System.out.print("Current history: ");
		for(String s : s1){
			System.out.print(s+ ", ");
		}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java BrowserQ23
Current history: Google, Youtube,
*/