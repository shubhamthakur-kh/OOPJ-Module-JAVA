import java.util.Scanner;
class DiscountCalQ40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        double result = (amount > 1000) ? amount * 0.90 : amount;
        System.out.println("Total cost after discount: " + result);
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac DiscountCalQ40.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java DiscountCalQ40
Enter purchase amount: 1200
Total cost after discount: 1080.0
*/