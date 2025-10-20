/*
Problem 4: Grocery Shopping List 
Use Case: A person maintains a grocery list and removes items as they purchase them. 
Requirements: 
● Add items to grocery list 
● Remove purchased items 
● Display remaining items 
Sample Input: 
Add items: "Milk", "Eggs", "Bread" 
Purchase: "Milk" 
Expected Output: 
Items to buy: Eggs, Bread
*/
import java.util.*;
class GroceryQ4{
	public static void main(String args[]){
		
		List<String> l1 = new ArrayList<>();
		
		l1.add("Milk");
		l1.add("Eggs");
		l1.add("Bread");
		
		l1.remove("Milk");
		
		System.out.println("Items to buy: " +l1);
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java GroceryQ4
Items to buy: [Eggs, Bread]
*/