import java.util.Scanner;
class Week18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day number : ");
		int day = sc.nextInt();
		
		switch (day) {
			case 1: System.out.println("Day is monday"); break;
			case 2: System.out.println("Day is Tuesday"); break;
			case 3: System.out.println("Day is wednsday"); break;
			case 4: System.out.println("Day is Thurday"); break;
			case 5: System.out.println("Day is Friday"); break;
			case 6: System.out.println("Day is Saturday"); break;
			case 7: System.out.println("Day is Sunday"); break;
			default: System.out.println("Invalid day number");
	
		}
	}
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\Object Oriented Programming With java\Assignment 1>java Week18
Enter day number : 6
Day is Saturday

C:\Users\Admin\Documents\CDAC\CDAC Codes\Object Oriented Programming With java\Assignment 1>java Week18
Enter day number : 8
Invalid day number
*/