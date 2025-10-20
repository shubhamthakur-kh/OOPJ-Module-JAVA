/*
Problem 25: Payment Processing 
Scenario: An e-commerce system receives payment amounts as strings from web forms and needs to 
convert them to integers for financial calculations. 
Task: Parse string input to integer and perform calculations. 
Sample Input: 
Amount as string: 1000 
Additional amount to add: 500 
Expected Output: 
1000 + 500 = 1500
*/
class PaymentParse{
	public static void main(String args[]){
		String s1 = "1000";
		int addAmount = 500;
		
		int amount = Integer.parseInt(s1);
		
		int total = amount + addAmount;
		
		System.out.println(amount + " + " + addAmount + " = " +total);
	}
}
/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac PaymentParse.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java PaymentParse
1000 + 500 = 1500
*/