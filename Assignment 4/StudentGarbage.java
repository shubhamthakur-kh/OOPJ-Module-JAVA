/*
Problem 22: Student Object Cleanup 
Scenario: A student management system creates student objects during registration. When these objects 
are no longer needed, the system should clean up resources before garbage collection. 
Task: Override finalize method to demonstrate cleanup during garbage collection. 
Sample Input: 
Student Name: Amit 
Expected Output: 
Student object for Amit is being garbage collected
*/
public class StudentGarbage{
	String name;
	
	public StudentGarbage(String name){
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Student object for " + name + " is being garbage collected");
		super.finalize();
	}
	
	public static void main(String args[]){
		StudentGarbage s = new StudentGarbage("Amit");
		
		s = null;
		
		System.gc();
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>javac StudentGarbage.java
StudentGarbage.java:9: warning: [removal] finalize() in Object has been deprecated and marked for removal
        protected void finalize() throws Throwable {
                       ^
StudentGarbage.java:11: warning: [removal] finalize() in Object has been deprecated and marked for removal
                super.finalize();
                     ^
2 warnings

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>java StudentGarbage
Student object for Amit is being garbage collected

C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 4>
*/