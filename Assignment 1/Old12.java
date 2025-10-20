import java.util.Scanner;
class Old12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age of Friend 1 :");
		int age1 = sc.nextInt();
		System.out.print("Enter age of Friend 2 :");
		int age2 = sc.nextInt();
		System.out.print("Enter age of Friend 3 :");
		int age3 = sc.nextInt();
		
		if(age1 > age2 && age1 > age3){
			System.out.println("Oldest : Friend 1" );
		}else if(age2 > age1 && age2 > age3){
			System.out.println("Oldest : Friend 2");
		}else{
			System.out.println("Oldest : Friend 3");
		}
		
		if(age1 < age2 && age1 < age3){
			System.out.println("Youngest : Friend 1" );
		}else if(age2 < age1 && age2 < age3){
			System.out.println("Youngest : Friend 2");
		}else{
			System.out.println("Youngest : Friend 3");
		}
	}
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\Object Oriented Programming With java\Assignment 1>javac Old12.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\Object Oriented Programming With java\Assignment 1>java Old12
Enter age of Friend 1 :22
Enter age of Friend 2 :25
Enter age of Friend 3 :20
Oldest : Friend 2
Youngest : Friend 3
*/