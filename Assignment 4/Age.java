/*
Problem 3: Age Input 
Scenario: A registration form for an online course asks for the user's age. Sometimes users accidentally 
enter text instead of numbers, causing the system to crash. 
 
Task: Create a registration system that safely converts age input from string to integer. 
 
Sample Input: 
eighteen 
 
Expected Output: 
Invalid number format 
*/
import java.util.*;
class Age{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		String a1 = sc.nextLine();
		
		try{
			int age = Integer.parseInt(a1);
			System.out.println("Age entered: " +age);
		}catch(NumberFormatException e){
			e.printStackTrace();
			System.out.println("Invalid number format");
		}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java Age
Enter age: seven
Invalid number format

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java Age
Enter age: 18
Age entered: 18
*/