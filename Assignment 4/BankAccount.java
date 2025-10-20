/*
Problem 20: Bank Account Security 
Scenario: A banking system needs to ensure that once a bank account ID is assigned, it cannot be 
changed for security and audit purposes. 
Task: Demonstrate the use of final variables in a banking context. 
Sample Input: 
Account ID: 101 
Expected Output: 
Account ID = 101 (cannot be changed) 
*/
class BankAccount{
	public static void main(String args[]){
		final int accountId = 101;
		
		 //accountId = 102; cannot assign a value to final variable accountId
	
		System.out.println("Account ID = " + accountId + "(cannot be changed)");
		
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac BankAccount.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java BankAccount
Account ID = 101(cannot be changed)
*/