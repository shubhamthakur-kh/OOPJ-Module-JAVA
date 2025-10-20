import java.util.Scanner;
class NumCheckQ32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num > 0) ? "Number is Positive" :
                        (num < 0) ? "Number is Negative" :
                        "Number is Zero";

        System.out.println(result);
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac NumCheckQ32.java
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java NumCheckQ32
Enter a number: -12
Number is Negative
*/