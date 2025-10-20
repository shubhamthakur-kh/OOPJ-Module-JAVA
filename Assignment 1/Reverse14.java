import java.util.Scanner;
class Reverse14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 4-digit number :");
		int num = sc.nextInt();
		int reverse = 0;
		
		while(num != 0){
			int digit =num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		System.out.println("Reversed number : " +reverse);
	}
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\Object Oriented Programming With java\Assignment 1>java Reverse14
Enter 4-digit number :1234
Reversed number : 4321
*/