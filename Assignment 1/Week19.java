import java.util.Scanner;
class Week19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month number : ");
		int month = sc.nextInt();
		
		switch (month) {
			case 1: System.out.println("31 days"); break;
			case 2: System.out.println("28 or 29 days"); break;
			case 3: System.out.println("31 days"); break;
			case 4: System.out.println("30 days"); break;
			case 5: System.out.println("31 days"); break;
			case 6: System.out.println("30 days"); break;
			case 7: System.out.println("31 days"); break;
			case 8: System.out.println("31 days"); break;
			case 9: System.out.println("30 days"); break;
			case 10: System.out.println("31 days"); break;
			case 11: System.out.println("30 days"); break;
			case 12: System.out.println("31 days"); break;
			default: System.out.println("Invalid month number ");
		}
	}
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac Week19.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java Week19
Enter month number : 2
28 or 29 days
*/