/*
Problem 15: Library Book Inventory 
Use Case: Track available copies of books in a library system. 
Requirements: 
● Map book titles to available copies 
● Update copies when books are borrowed 
● Display current inventory 
Sample Input: 
Initial inventory: "Java" → 3, "Python" → 5 
Borrow: "Java" (1 copy) 
Expected Output: 
Current inventory: Java:2, Python:5
*/
import java.util.*;
class LibraryQ15{
	public static void main(String args[]){
		Map<String, Integer> m1 = new HashMap<>();
		
		m1.put("Java",3);
		m1.put("Python",5);
		
		if(m1.containsKey("Java") && m1.get("Java")>0){
			m1.put("Java", m1.get("Java") - 1);
		}
		System.out.print("Current inventory: ");
		m1.forEach((title, copies) -> 
		System.out.print(title + ":" + copies + ", "));
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java LibraryQ15
Current inventory: Java:2, Python:5,
*/