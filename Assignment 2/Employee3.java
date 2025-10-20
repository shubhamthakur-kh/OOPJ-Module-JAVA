/*
Problem 16: Employee Net Salary 
Scenario: 
Extend previous problem. Add method calculateNetSalary(): 
● Add 10% HRA, 5% DA, deduct 2% PF from basicSalary 
● Print net salary for 2 employees 
*/
class Employee3 {
    int id;
    String name;
    double basicSalary;
    static int counter = 1001;

    Employee3() {
        this.id = counter++;
        this.name = "Unknown";
        this.basicSalary = 20000;
    }

    Employee3(String name, double basicSalary) {
        this.id = counter++;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateNetSalary() {
        double hra = 0.10 * basicSalary;
        double da = 0.05 * basicSalary;
        double pf = 0.02 * basicSalary;
        return basicSalary + hra + da - pf;
    }

    void showDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Net Salary: " + calculateNetSalary());
    }
	
    public static void main(String[] args) {
        Employee3 e1 = new Employee3(); // Default values
        Employee3 e2 = new Employee3("Ravi", 35000); // Custom values

        e1.showDetails();
        e2.showDetails();
    }
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>java Employee3
ID: 1001, Name: Unknown, Net Salary: 22600.0
ID: 1002, Name: Ravi, Net Salary: 39550.0
*/
