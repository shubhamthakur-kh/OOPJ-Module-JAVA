/*
Problem 13: Order Number Display 
Scenario: An e-commerce system generates invoice numbers and needs to display them in reverse order 
for verification purposes. 
Task: Use StringBuilder to reverse order numbers. 
Sample Input: 
INV2025 
Expected Output: 
5202VNI 
*/
class NumberDisplay{
	public static void main(String args[]){
		
		StringBuilder s1 = new StringBuilder("INV2025");
		
		System.out.println(s1.reverse());
		
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac NumberDisplay.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java NumberDisplay
5202VNI
*/