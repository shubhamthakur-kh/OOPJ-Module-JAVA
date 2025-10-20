import java.util.Scanner;
class OptionQ27{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'A':
                System.out.println("You selected option A.");
                break;
            case 'B':
                System.out.println("You selected option B.");
                break;
            case 'C':
                System.out.println("You selected option C.");
                break;
            case 'D':
                System.out.println("You selected option D.");
                break;
            case 'E':
                System.out.println("You selected option E.");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac OptionQ27.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java OptionQ27
Enter a character (A?E): B
You selected option B.
*/