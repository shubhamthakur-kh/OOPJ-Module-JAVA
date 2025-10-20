import java.util.Scanner;
class LeapYearQ37{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
                        ? "Leap Year" 
                        : "Not a Leap Year";

        System.out.println(result);
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac LeapYearQ37.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java LeapYearQ37
Enter year: 2024
Leap Year
*/