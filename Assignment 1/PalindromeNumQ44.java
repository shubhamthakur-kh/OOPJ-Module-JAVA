import java.util.Scanner;
class PalindromeNumQ44{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number: " + reverse);
        System.out.println("Palindrome: " + (original == reverse ? "Yes" : "No"));
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac PalindromeNumQ44.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java PalindromeNumQ44
Enter 4-digit number: 1221
Reversed number: 1221
Palindrome: Yes
*/