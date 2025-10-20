import java.util.Scanner;
class EvenOddQ47{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Both numbers are even");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Both numbers are odd");
        } else {
            System.out.println("Numbers are mixed (one even, one odd)");
        }
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac EvenOddQ47.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java EvenOddQ47
Enter first number: 12
Enter second number: 17
Numbers are mixed (one even, one odd)
*/