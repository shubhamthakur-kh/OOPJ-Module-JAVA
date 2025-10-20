import java.util.Scanner;
class Div17{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		if(num % 2 == 0){
			System.out.println("Divisible by 2");
		}if(num % 3 == 0){
			System.out.println("Divisible by 3");
		}if(num % 5 == 0){
			System.out.println("Divisible by 5");
		}else{
			System.out.println("Not divisible bye 2");
		}
	}
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\Object Oriented Programming With java\Assignment 1>java Div17
Enter number : 30
Divisible by 2
Divisible by 3
Divisible by 5
*/