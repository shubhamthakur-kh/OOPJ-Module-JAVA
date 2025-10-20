import java.util.Scanner;
class VowelConQ38{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                        ? "Vowel"
                        : "Consonant";

        System.out.println(result);
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac VowelConQ38.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java VowelConQ38
Enter a character: i
Vowel
*/