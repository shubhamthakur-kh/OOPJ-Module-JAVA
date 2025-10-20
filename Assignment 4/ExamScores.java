/*
Problem 2: Exam Scores 
Scenario: A teacher is using a digital gradebook system to access student scores. Sometimes they might 
accidentally try to access the score of a student number that doesn't exist in the class roster. 
 
Task: Create a program that stores exam scores in an array and safely accesses student scores by index. 
 
Sample Input: 
3 
78 90 85 
5 
 
Expected Output: 
Invalid index
*/
import java.util.*;
class ExamScores{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int numStud = sc.nextInt();
		int score[] = new int[numStud];
		
		for(int i=0;i<numStud;i++){
			score[i] = sc.nextInt();
		}
		int index = sc.nextInt();
		try{
			System.out.println(score[index]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index accessed");
		}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java ExamScores
3
78 90 85
5
Invalid index accessed
*/