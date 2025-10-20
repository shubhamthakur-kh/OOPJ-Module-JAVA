/*
Problem 6: Age Restriction 
Scenario: A professional workshop registration system only allows participants who are 18 years or 
older. The system needs a custom exception for age validation. 
Task: Create a custom exception class and use it to validate user age during registration. 
Sample Input: 
16 
Expected Output: 
AgeNotValidException: Age must be ≥ 18
*/
// custom exception
class AgeNotValidException extends Exception{
	public AgeNotValidException(String message){
		super(message);
	}
}

public class AgeValid {
	static void validateAge(int age) throws AgeNotValidException{
		if(age <  18){
			throw new AgeNotValidException("Age must be >=18");	
		}else{
			System.out.println("Registration successful " +age);
		}
	}
	
public static void main(String args[]){
		int age = 16;
		
		try{
			validateAge(age);
		}catch(AgeNotValidException e){
			System.out.println("AgeNotValidException:"+e.getMessage());
		}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac AgeValid.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java AgeValid
AgeNotValidException:Age must be >=18
*/