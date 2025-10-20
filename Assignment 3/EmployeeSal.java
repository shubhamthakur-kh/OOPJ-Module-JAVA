/*
16. Employee Salary Display 
Scenario: Company wants to display employee salary with different bonus calculations based on 
employee type. 
Problem Statement: 
Create class Employee with method displaySalary(). Subclass Manager and Developer override 
displaySalary() to include bonus. 
Classes/Fields: 
● Employee → name, salary, displaySalary() prints salary 
● Manager → overrides displaySalary() → adds 20% bonus 
● Developer → overrides displaySalary() → adds 10% bonus 
Sample Input: 
Manager → name=Anita, salary=50000 
Developer → name=Rohit, salary=40000 
Sample Output: 
Anita Total Salary = 60000 
Rohit Total Salary = 44000 

*/

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println(name + " Salary = " + (int)salary);
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void displaySalary() {
        double totalSalary = salary + (salary * 0.20);
        System.out.println(name + " Total Salary = " + (int)totalSalary);
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void displaySalary() {
        double totalSalary = salary + (salary * 0.10);
        System.out.println(name + " Total Salary = " + (int)totalSalary);
    }
}

public class EmployeeSal {
    public static void main(String[] args) {
        Employee e1 = new Manager("Anita", 50000);
        Employee e2 = new Developer("Rohit", 40000);

        e1.displaySalary();
        e2.displaySalary();
    }
}

/*

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac EmployeeSal.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java EmployeeSal
Anita Total Salary = 60000
Rohit Total Salary = 44000

*/
