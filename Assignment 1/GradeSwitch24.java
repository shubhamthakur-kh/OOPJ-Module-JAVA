import java.util.Scanner;
class GradeSwitch24{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks : ");
        int marks = sc.nextInt();
        int point = marks / 10;

        switch (point) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
                System.out.println("Grade: C");
                break;
            case 5:
                System.out.println("Grade: D");
                break;
            case 4:
            case 3:
                System.out.println("Grade: E");
                break;
            case 2:
            case 1:
            case 0:
                System.out.println("Grade: F");
                break;
            default:
                System.out.println("Invalid marks");
        }
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac GradeSwitch24.java
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java GradeSwitch24
Enter marks : 78
Grade: B
*/