import java.util.Scanner;
class SortThreeNQ45{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int temp;
       
        if (a > b) { temp = a; a = b; b = temp; }
        if (a > c) { temp = a; a = c; c = temp; }
        if (b > c) { temp = b; b = c; c = temp; }

        System.out.println("Ascending order: " + a + ", " + b + ", " + c);
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac SortThreeNQ45.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java SortThreeNQ45
Enter three numbers : 45 12 78
Ascending order: 12, 45, 78
*/