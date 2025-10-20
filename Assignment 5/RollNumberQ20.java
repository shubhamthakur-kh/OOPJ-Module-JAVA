/*
Problem 20: Even Roll Number Filter 
Use Case: Filter and display only students with even roll numbers. 
Requirements: 
● Process list of roll numbers 
● Remove odd roll numbers 
● Display filtered results 
Sample Input: 
Roll numbers: 101, 102, 103, 104 
Expected Output: 
Even Roll Numbers: 102, 104
*/
import java.util.*;
class RollNumberQ20{
	public static void main(String args[]){
		List<Integer> num = new ArrayList<>();
		num.add(101);
		num.add(102);
		num.add(103);
		num.add(104);
		
		Iterator<Integer> it = num.iterator();
		while (it.hasNext()){
			if(it.next() % 2 != 0){
				it.remove();
			}
		}
		System.out.print("Even Roll Numbers: ");
		num.forEach(number -> System.out.print(number + ", "));
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java RollNumberQ20
Even Roll Numbers: 102, 104,
*/