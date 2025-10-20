/*
Scenario: 
A school wants to initialize the tuition fee for all students once at program start. Each student has name 
and class. Use static blocks to set the fee and setters/getters to update/access student information. 
Tasks: 
1. Create a Student class. 
2. Use a static block to initialize tuitionFee to 30000. 
3. Create instance variables: name (String) and className (String). 
4. Create setters and getters for name and className. 
5. Print student details including tuition fee. 
Input Example: 
Student1: Name="Anjali", Class="10th" 
Student2: Name="Vikram", Class="12th" 
Expected Output: 
School Tuition Fee Initialized: 30000 
Student1: Name=Anjali, Class=10th, Tuition Fee=30000 
Student2: Name=Vikram, Class=12th, Tuition Fee=30000 
*/
class StudentFee {
    String name;
    String className;
    static int tuitionFee;

    // Static block to initialize tuition fee
    static {
        tuitionFee = 30000;
        System.out.println("School Tuition Fee Initialized: " + tuitionFee);
    }

    // Constructor
    StudentFee(String name, String className) {
        this.name = name;
        this.className = className;
    }

    // Setters
    void setName(String name) {
        this.name = name;
    }

    void setClassName(String className) {
        this.className = className;
    }

    // Getters
    String getName() {
        return name;
    }

    String getClassName() {
        return className;
    }

    static int getTuitionFee() {
        return tuitionFee;
    }

    // Method to display student details
    void showDetails() {
        System.out.println("Name=" + name + ", Class=" + className + ", Tuition Fee=" + tuitionFee);
    }
	
    public static void main(String[] args) {
        // Creating student objects
        StudentFee s1 = new StudentFee("Anjali", "10th");
        StudentFee s2 = new StudentFee("Vikram", "12th");

        // Displaying student details
        System.out.print("Student1: "); s1.showDetails();
        System.out.print("Student2: "); s2.showDetails();
    }
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>javac StudentFee.java
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>java StudentFee
School Tuition Fee Initialized: 30000
Student1: Name=Anjali, Class=10th, Tuition Fee=30000
Student2: Name=Vikram, Class=12th, Tuition Fee=30000

*/

