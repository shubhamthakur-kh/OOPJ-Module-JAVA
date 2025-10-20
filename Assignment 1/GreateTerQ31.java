import java.util.Scanner;
class GreateTerQ31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int greatest = (num1 > num2) ? num1 : num2;
        System.out.println("Greatest number: " + greatest);
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac GreateTerQ31.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java GreateTerQ31
Enter first number: 45
Enter second number: 30
Greatest number: 45
*/