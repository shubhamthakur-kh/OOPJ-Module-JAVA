/*
Problem 4: Employee Salary Manager 
Scenario: A company in Bengaluru wants to maintain employee details and give a bonus to employees 
who have worked more than 5 years. 
Requirements: 
1. Create a class Employee with instance variables: name (String), salary (double), yearsOfService 
(int). 
2. Create static variable totalEmployees to store the number of employees created. 
3. Constructor should initialize all instance variables and increment totalEmployees. 
4. Create getters and setters for all instance variables. 
5. Create a method calculateBonus() that returns 5% of salary if yearsOfService > 5, otherwise 0. 
6. Create a static method showTotalEmployees() to print total employees created. 
7. Write a main class to create 3 employees, print their bonuses, and print total employees. 
Input Example: 
Employee1: Name: "Ravi", Salary: 150000, Years of Service: 6 
Employee2: Name: "Anita", Salary: 120000, Years of Service: 3 
Employee3: Name: "Suresh", Salary: 100000, Years of Service: 5 
Expected Output: 
Employee Ravi Bonus: 7500.0 
Employee Anita Bonus: 0.0 
Employee Suresh Bonus: 0.0 
Total employees: 3 
*/
class Employee {
    String name;
    double salary;
    int yearsOfService;

  
    static int totalEmployees = 0;

    
    Employee(String name, double salary, int yearsOfService) {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        totalEmployees++; 
    }

    
    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    int getYearsOfService() {
        return yearsOfService;
    }


    void setName(String name) {
        this.name = name;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

   
    double calculateBonus() {
        if (yearsOfService > 5) {
            return salary * 0.05;
        } else {
            return 0.0;
        }
    }

    static void showTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }
	
    public static void main(String[] args) {
        // Creating 3 employee objects
        Employee emp1 = new Employee("Ravi", 150000, 6);
        Employee emp2 = new Employee("Anita", 120000, 3);
        Employee emp3 = new Employee("Suresh", 100000, 5);

        // Display bonuses
        System.out.println("Employee " + emp1.getName() + " Bonus: " + emp1.calculateBonus());
        System.out.println("Employee " + emp2.getName() + " Bonus: " + emp2.calculateBonus());
        System.out.println("Employee " + emp3.getName() + " Bonus: " + emp3.calculateBonus());

        // Show total employees
        Employee.showTotalEmployees();
    }
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>javac Employee.java
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>java Employee
Employee Ravi Bonus: 7500.0
Employee Anita Bonus: 0.0
Employee Suresh Bonus: 0.0
Total employees: 3
*/

