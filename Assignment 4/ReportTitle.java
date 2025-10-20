/*
Problem 14: Report Title 
Scenario: A report generation system needs to modify document titles by adding department names and 
updating formatting. 
Task: Use StringBuilder method chaining to efficiently modify report titles. 
Sample Input: 
Original title: Annual Report 
Department Name: CDAC 
Expected Output: 
Annual CDAC Report 
*/
class ReportTitle{
	public static void main(String args[]){
		
		StringBuilder s1 = new StringBuilder("Annual Report");
		
		s1.insert(7,"CDAC ");
		
		System.out.println(s1);
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac ReportTitle.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java ReportTitle
Annual CDAC Report
*/