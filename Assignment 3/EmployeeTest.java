/*

29. Employee Management System 
Scenario: Manage employee details, calculate salaries, and differentiate employee types. 
Problem Statement: 
● Abstract Class Employee → instance variables: name, id 
○ Abstract method calculateSalary() → different calculation for each type 
● Class PermanentEmployee extends Employee → include basicSalary and hra → implement 
calculateSalary() 
● Class ContractEmployee extends Employee → include hourlyRate and hoursWorked → 
implement calculateSalary() 
● Interface BonusEligible → method calculateBonus() → applies only to permanent employees 
● In main(), create 2 permanent and 2 contract employees, display salary + bonus if eligible 
Sample Input: 
PermanentEmployee → name="Amit", basicSalary=50000, hra=5000 
ContractEmployee → name="Neha", hourlyRate=300, hoursWorked=100 
Sample Output: 
Amit Salary = 55000, Bonus = 5500 
Neha Salary = 30000 


*/


interface BonusEligible {
    double calculateBonus();
}

abstract class Employee {
    String name;
    int id;
    
    Employee(String name) {
        this.name = name;
    }
    
    abstract double calculateSalary();
}

class PermanentEmployee extends Employee implements BonusEligible {
    double basicSalary;
    double hra;

    PermanentEmployee(String name, double basicSalary, double hra) {
        super(name);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    @Override
    double calculateSalary() {
        return basicSalary + hra;
    }

    @Override
    public double calculateBonus() {
        return 0.1 * calculateSalary(); // 10% bonus
    }
}

class ContractEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    ContractEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        PermanentEmployee p1 = new PermanentEmployee("Amit", 50000, 5000);
        PermanentEmployee p2 = new PermanentEmployee("Priya", 60000, 6000);
        ContractEmployee c1 = new ContractEmployee("Neha", 300, 100);
        ContractEmployee c2 = new ContractEmployee("Rohit", 250, 120);

        System.out.println(p1.name + " Salary = " + (int)p1.calculateSalary() + ", Bonus = " + (int)p1.calculateBonus());
        System.out.println(p2.name + " Salary = " + (int)p2.calculateSalary() + ", Bonus = " + (int)p2.calculateBonus());
        System.out.println(c1.name + " Salary = " + (int)c1.calculateSalary());
        System.out.println(c2.name + " Salary = " + (int)c2.calculateSalary());
    }
}

/*

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac EmployeeTest.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java EmployeeTest
Amit Salary = 55000, Bonus = 5500
Priya Salary = 66000, Bonus = 6600
Neha Salary = 30000
Rohit Salary = 30000

*/

