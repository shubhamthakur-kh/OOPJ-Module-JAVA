/*
Problem 17: Grade Distribution Counter 
Use Case: Analyze the distribution of grades in a class. 
Requirements: 
● Count frequency of each grade 
● Display grade distribution 
● Handle multiple occurrences 
Sample Input: 
Grades: ["A", "B", "A", "C", "B", "A"] 
Expected Output: 
Grade Distribution: A=3, B=2, C=1 
*/
import java.util.*;
class GradeQ17{
	public static void main(String[] args){
		String[] grades = {"A", "B", "A", "C", "B", "A"};
		Map<String, Integer> m1 = new HashMap<>();
		
		for (String grade : grades) {
			
			m1.merge(grade, 1, Integer::sum);
	    }
		
		System.out.print("Grade Distribution: ");
		m1.forEach((grade, count) -> 
		System.out.print(grade + "=" + count + ","));
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java GradeQ17
Grade Distribution: A=3,B=2,C=1,
*/