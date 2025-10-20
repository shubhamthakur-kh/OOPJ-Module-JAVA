import java.util.Scanner;
class SimpleCalQ30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0)
                    System.out.println("Result: " + (num1 / num2));
                else
                    System.out.println("Error: Division by zero");
                break;
            default:
                System.out.println("Invalid operation selected.");
        }
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac SimpleCalQ30.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java SimpleCalQ30
Select operation:
1 - Addition
2 - Subtraction
3 - Multiplication
4 - Division
Enter choice: 1
Enter first number: 20
Enter second number: 30
Result: 50.0
*/