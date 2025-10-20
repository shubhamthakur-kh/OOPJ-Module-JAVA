import java.util.Scanner;
class SeasonQ26{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int month = sc.nextInt();

        if (month == 12 || month == 1 || month == 2)
            System.out.println("Season is Winter");
        else if (month >= 3 && month <= 5)
            System.out.println("Season is Summer");
        else if (month >= 6 && month <= 8)
            System.out.println("Season is Monsoon");
        else if (month >= 9 && month <= 11)
            System.out.println("Season is Autumn");
        else
            System.out.println("Invalid month number");
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac SeasonQ26.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java SeasonQ26
Enter month number: 12
Season is Winter
*/