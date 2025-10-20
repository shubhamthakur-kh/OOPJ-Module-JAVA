import java.util.Scanner;
class MenuMes25{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected option 1.");
                break;
            case 2:
                System.out.println("You selected option 2.");
                break;
            case 3:
                System.out.println("You selected option 3.");
                break;
            case 4:
                System.out.println("You selected option 4.");
                break;
            case 5:
                System.out.println("You selected option 5.");
                break;
            default:
                System.out.println("Invalid option. Please enter a number between 1 and 5.");
        }
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac MenuMes25.java
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java MenuMes25
Enter a number : 3
You selected option 3.
*/