/*
Problem 15:  Employee Auto-ID Generator 
Scenario: 
Create Employee class with id, name, basicSalary. 
● Add static counter starting from 1001 for IDs. 
● Default constructor → name = "Unknown", salary = 20000 
● Parameterized constructor → accept name and salary 
● Getter for all variables 
● Create 2 employees and display their IDs, names, salary. 
*/
class Employee2 {
    int id;
    String name;
    double basicSalary;
    static int counter = 1001;

    // Default constructor
    Employee2() {
        this.id = counter++;
        this.name = "Unknown";
        this.basicSalary = 20000;
    }

    // Parameterized constructor
    Employee2(String name, double basicSalary) {
        this.id = counter++;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Getters
    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getBasicSalary() {
        return basicSalary;
    }

    void showDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + basicSalary);
    }
	
    public static void main(String[] args) {
        Employee2 e1 = new Employee2(); // Uses default constructor
        Employee2 e2 = new Employee2("Ravi", 35000); // Uses parameterized constructor

        e1.showDetails();
        e2.showDetails();
    }
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>java Employee2
ID: 1001, Name: Unknown, Salary: 20000.0
ID: 1002, Name: Ravi, Salary: 35000.0
*/
