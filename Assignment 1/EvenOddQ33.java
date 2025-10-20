import java.util.Scanner;
class EvenOddQ33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "Number is Even" : "Number is Odd";
        System.out.println(result);
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac EvenOddQ33.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java EvenOddQ33
Enter a number: 17
Number is Odd
*/