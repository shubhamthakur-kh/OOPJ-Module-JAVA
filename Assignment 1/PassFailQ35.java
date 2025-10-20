import java.util.Scanner;
class PassFailQ35{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        String result = (marks >= 35) ? "Pass" : "Fail";
        System.out.println(result);
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac PassFailQ35.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java PassFailQ35
Enter marks: 28
Fail
*/