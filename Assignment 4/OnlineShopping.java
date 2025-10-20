/*
Problem 5: Online Shopping 
Scenario: An e-commerce platform processes orders by calculating the total price (quantity × unit price). 
The system needs to handle invalid quantities and accessing non-existent products. 
 
Task: Create an order processing method that handles multiple exception types. 
 
Sample Input: 
0 
3 
299.99 499.99 199.99 
5 
Expected Output: 
Arithmetic Exception caught 
or 
Array Inde
*/
import java.util.*;
class OnlineShopping{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int quantity = sc.nextInt();
		int index = sc.nextInt();
		
		double[] prices = new double[3];
		for(int i=0;i<prices.length;i++){
			prices[i] = sc.nextDouble();
			
		}
		try{
			double unitPrice = prices[index];
			double totalPrice = unitPrice * quantity;
			System.out.println("Total Price:" +totalPrice);
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Exception");
		}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java OnlineShopping
0
3
299.99 499.99 199.99
Array Index Exception
*/