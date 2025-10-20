import java.util.Scanner;
class weekTer22{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month number :");
		int month = sc.nextInt();
		
		String result = (month == 1) ? "Month is january" :
		                (month == 2) ? "Month is February" :
						(month == 3) ? "Month is march" :
						(month == 4) ? "Month is april" :
						(month == 5) ? "Month is may" :
						(month == 6) ? "Month is june" :
						(month == 7) ? "Month is july" :
						(month == 8) ? "Month is august" :
						(month == 9) ? "Month is september" :
						(month == 10) ? "Month is october" :
						(month == 11) ? "Month is november" :
						(month == 12) ? "Month is december" :
						"Invalid month number";
	    System.out.println(result);
	}
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac weekTer21.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java weekTer21
Enter month number :8
Month is august
*/