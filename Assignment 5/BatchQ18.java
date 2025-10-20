/*
Problem 18: Batch Merger System 
Use Case: Merge student lists from morning and evening batches, removing duplicates. 
Requirements: 
● Combine two student lists 
● Remove duplicate students 
● Maintain unique student list 
Sample Input: 
Morning batch: "Amit", "Priya" 
Evening batch: "Rohan", "Priya" 
Expected Output: 
Combined batches: Amit, Priya, Rohan
*/
import java.util.*;
class BatchQ18{
	public static void main(String args[]){
		List<String> morBatch = Arrays.asList("Amit", "Priya");
		List<String> eveBatch = Arrays.asList("Rohan", "Priya");
		
		Set<String> s1 = new LinkedHashSet<>();
		
		s1.addAll(morBatch);
		s1.addAll(eveBatch);
		
		System.out.print("Combined Batch: ");
		s1.forEach(name -> 
		System.out.print(name + ", "));
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java BatchQ18
Combined Batch: Amit, Priya, Rohan,
*/