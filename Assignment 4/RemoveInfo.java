/*
Problem 17: Remove Outdated Information 
Scenario: An academic system maintains course information that includes year details. When information 
becomes outdated, the year needs to be removed. 
Task: Use StringBuffer to remove outdated information. 
Sample Input: 
Original text: CDAC Kharghar 2024 
Exact substring to delete: 2024 
Expected Output: 
CDAC Kharghar
*/
class RemoveInfo{
	public static void main(String args[]){
		
		StringBuffer s1 = new StringBuffer("CDAC Kharghar 2024");
		String del = "2024";
		int extract = s1.indexOf(del);
		
		s1.delete(extract, extract + del.length());
		
		System.out.println(s1);
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac RemoveInfo.java

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java RemoveInfo
CDAC Kharghar
*/