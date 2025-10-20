import java.util.Scanner;
class DigiQ43{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac DigiQ43.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java DigiQ43
Enter number: 482
Sum of digits: 14
*/