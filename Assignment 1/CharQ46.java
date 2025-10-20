import java.util.Scanner;
class CharQ46{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac CharQ46.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java CharQ46
Enter a character: %
Special Character
*/