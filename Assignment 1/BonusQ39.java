import java.util.Scanner;
class BonusQ39{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = (years > 5) ? salary * 0.05 : 0;
        System.out.println("Bonus: " + bonus);
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac BonusQ39.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java BonusQ39
Enter salary: 50000
Enter years of service: 6
Bonus: 2500.0
*/