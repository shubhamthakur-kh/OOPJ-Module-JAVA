import java.util.Scanner;
class TrafficSigQ28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter traffic light color : ");
        String color = sc.nextLine();

        if (color.equalsIgnoreCase("Red"))
            System.out.println("Stop");
        else if (color.equalsIgnoreCase("Yellow"))
            System.out.println("Wait");
        else if (color.equalsIgnoreCase("Green"))
            System.out.println("Go");
        else
            System.out.println("Invalid color input");
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac TrafficSigQ28.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java TrafficSigQ28
Enter traffic light color : Green
Go
*/