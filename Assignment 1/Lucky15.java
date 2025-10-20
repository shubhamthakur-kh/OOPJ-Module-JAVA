import java.util.Scanner;
class Lucky15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 4-digit number :");
		int num = sc.nextInt();
		
		int A = num / 1000;
		int B = (num / 100)%10;
		int C = (num / 10)%10;
		int D = num %10;
		
		if(A + B == C + D){
			System.out.println("Lucky number ");
		}else{
			System.out.println("Not a lucky number ");
		}
	}
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\Object Oriented Programming With java\Assignment 1>java Lucky15
Enter 4-digit number :3521
Not a lucky number
*/