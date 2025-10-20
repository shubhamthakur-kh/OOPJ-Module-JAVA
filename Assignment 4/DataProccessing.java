/*
Problem 21: Data Processing Cleanup 
Scenario: A data processing system handles user form submissions and must always close database 
connections and clean up resources, whether the processing succeeds or fails. 
Task: Use finally block to ensure proper resource cleanup. 
Sample Input: 
(No input required) 
Expected Output: 
Exception occurred: Invalid input 
Data processing completed 
*/
class DataProccessing{
	public static void main(String args[]){
		try{
			throw new Exception("Invalid input");
		}catch(Exception e){
			System.out.println("Exception occure: " +e.getMessage());
		}finally{
			System.out.println("Data processing completed");
		}
	}
}
/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac DataProccessing.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java DataProccessing
Exception occure: Invalid input
Data processing completed
*/