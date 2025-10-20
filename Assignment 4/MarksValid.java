/*
Problem 9: Marks Validation 
Scenario: An online examination system needs to validate that marks entered by teachers are within valid 
range (0-100). Negative marks should not be allowed. 
Task: Create a marks validation method that throws an exception for invalid marks. 
Sample Input: -5 
Expected Output: 
Invalid marks
*/
class MarksValid{
	public static void validateMarks(int marks) throws Exception{
		if(marks < 0 || marks > 100){
			throw new Exception("Invalid marks");
		}else{
			System.out.println("Marks Entered: " +marks);
		}
	}
	public static void main(String args[]){
		int marks = -5;
		
		try{
			validateMarks(marks);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}	
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac MarksValid.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java MarksValid
Invalid marks
*/
