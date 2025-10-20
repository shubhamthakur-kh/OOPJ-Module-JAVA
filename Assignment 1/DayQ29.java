import java.util.Scanner;
class DayQ29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day type (1–Workday, 2–Weekend): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("It’s a workday. Time to get things done!");
                break;
            case 2:
                System.out.println("It’s weekend. No work today.");
                break;
            default:
                System.out.println("Please enter 1 or 2.");
        }
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac DayQ29.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java DayQ29
Enter day type (1?Workday, 2?Weekend): 2
It?s weekend. No work today.
*/