class Exam13{
	public static void main(String args[]){
	int clheld = 100;
	int clattended = 60;
	String medical = "Y";
	double percentage = (clattended * 100) / clheld;
	
	if(percentage >= 75 || medical.equalsIgnoreCase("Y")) {
        System.out.println("Student is allowed to sit for the exam.");
    }else{
     System.out.println("Student is not allowed to sit for the exam.");
    }
  }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\Object Oriented Programming With java\Assignment 1>javac Exam13.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\Object Oriented Programming With java\Assignment 1>java Exam13
Student is allowed to sit for the exam.

*/