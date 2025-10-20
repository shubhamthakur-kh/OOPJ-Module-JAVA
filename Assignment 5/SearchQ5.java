/*
Problem 5: Recent Search History 
Use Case: A search application maintains the last 5 searches, removing the oldest when the limit is 
exceeded. 
Requirements: 
● Store recent searches (maximum 5) 
● Remove oldest search when limit exceeded 
● Maintain insertion order 
Sample Input: 
Searches: "Java", "Python", "C++", "DSA", "OOP", "Spring" 
Expected Output: 
Recent searches: Python, C++, DSA, OOP, Spring
*/
import java.util.*;

class SearchQ5{
	public static void main(String args[]){
		Queue<String> q1 = new LinkedList<>();
			String[] s1 = {"Java","Python", "C++", "DSA", "OOP", "Spring"};
			
			for(String str : s1){
				if(q1.size()== 5){
					q1.poll();
				}
				q1.offer(str);
			}
		System.out.println("Recent searches: " +q1);
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java SearchQ5
Recent searches: [Python, C++, DSA, OOP, Spring]
*/