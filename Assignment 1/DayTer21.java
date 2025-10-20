import java.util.Scanner;
class DayTer21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number : ");
        int day = sc.nextInt();

        String result = (day == 1) ? "Day is Monday" :
                        (day == 2) ? "Day is Tuesday" :
                        (day == 3) ? "Day is Wednesday" :
                        (day == 4) ? "Day is Thursday" :
                        (day == 5) ? "Day is Friday" :
                        (day == 6) ? "Day is Saturday" :
                        (day == 7) ? "Day is Sunday" :
                        "Invalid day number";

        System.out.println(result);
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac DayTer21.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java DayTer21
Enter day number : 3
Day is Wednesday

*/