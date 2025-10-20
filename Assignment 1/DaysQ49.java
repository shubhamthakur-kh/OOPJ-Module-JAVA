import java.util.Scanner;
class DaysQ49{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month number : ");
        int month = sc.nextInt();

        int days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
                break;
            default:
                System.out.println("Invalid month number.");
                return;
        }

        System.out.println(days + " days");
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac DaysQ49.java
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java DaysQ49
Enter year: 2024
Enter month number : 2
29 days
*/