/*
Problem 10: Electronic Voting System 
Use Case: Track unique voters in an election system to prevent duplicate voting. 
Requirements: 
● Record voter IDs 
● Ensure one vote per voter 
● Count total unique voters 
Sample Input: 
Voter IDs: 201, 202, 203, 202 
Expected Output: 
Total voters: 3 
*/
import java.util.*;
class VotingQ10{
	public static void main(String args[]){
		Set<Integer> s1 = new HashSet<>();
		
		int[] input = {201, 202, 203, 202};
		for(int id : input){
			s1.add(id);
		}
		
		System.out.println("Total voters: " +s1.size());
	}
	
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>javac VotingQ10.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java VotingQ10
Total voters: 3
*/