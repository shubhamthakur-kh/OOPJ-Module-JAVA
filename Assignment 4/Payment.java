/*
Problem 8: Payment Processing 
Scenario: A payment gateway system processes transactions and needs to clean up database connections 
(just a scenario, database knowledge not required) regardless of whether the payment succeeds or fails. 
Task: Create a payment processing method that uses finally block for cleanup operations. 
Sample Input: 
(No input required) 
Expected Output: 
Exception occurred: Payment failed   
Cleanup done
*/
class Payment{
	public static void process(){
		try{
			throw new Exception("Payment failed");	
		}catch(Exception e){
			System.out.println("Exception Occures " + e.getMessage());
			
		}finally{
			System.out.println("Cleanup done");
		}
	}
	public static void main(String args[]){
		process();
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac Payment.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java Payment
Exception Occures Payment failed
Cleanup done
*/