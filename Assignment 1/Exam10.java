import java.util.Scanner;
class Exam10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total classes held :");
		int held = sc.nextInt();
		System.out.print("Enter classes attended :");
		int attend = sc.nextInt();
		
		double avg = ((double)attend / held)* 100;
		if(avg >= 75){
			System.out.println("Student is allowed to sit for the exam");	
		}else{
			System.out.println("Student is not allowed to sit for the exam");
		}
	}
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\Object Oriented Programming With java\Assignment 1>java Exam10
Enter total classes held :100
Enter classes attended :75
Student is allowed to sit for the exam
*/