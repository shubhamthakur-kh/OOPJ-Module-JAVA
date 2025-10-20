import java.util.Scanner;

class Calculator20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator : ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Result: " + (num1 + num2));
        }else{
         if (op == '-') {
           System.out.println("Result: " + (num1 - num2));
        }else{
        if (op == '*') {
           System.out.println("Result: " + (num1 * num2));
        }else{
        if (op == '/') {
             if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
                }else{
                    System.out.println("Error: Division by zero");
                }
            }else{
               System.out.println("Error: Invalid operator");
                 }
			
			
                }
            }
        }
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac Calculator20.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java Calculator20
Enter first number: 10
Enter second number: 5
Enter operator (+, -, *, /): *
Result: 50.0

*/