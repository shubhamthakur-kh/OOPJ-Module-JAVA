/*

7. Employee Hierarchy 
Scenario: A company has regular and contractual employees with different pay structures. 
Problem Statement: 
Create a superclass Employee with name and basicSalary. Subclass RegularEmployee adds HRA 10%, 
Subclass ContractEmployee adds allowance 5%. Display net salary. 
Classes/Fields: 
● Employee → name, basicSalary 
● RegularEmployee → HRA 10% 
● ContractEmployee → allowance 5% 
Sample Input: 
Regular → name=Rahul, basicSalary=20000 
Contract → name=Riya, basicSalary=15000 
Sample Output: 
Rahul Net Salary = 22000 
Riya Net Salary = 15750 

*/

class Employee {
    protected String name;
    protected double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }
}

class RegularEmployee extends Employee {
    public RegularEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (0.10 * basicSalary); // 10% HRA
    }
}

class ContractEmployee extends Employee {
    public ContractEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (0.05 * basicSalary); // 5% Allowance
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        RegularEmployee emp1 = new RegularEmployee("Rahul", 20000);
        ContractEmployee emp2 = new ContractEmployee("Riya", 15000);

        System.out.println(emp1.name + " Net Salary = " + emp1.calculateSalary());
        System.out.println(emp2.name + " Net Salary = " + emp2.calculateSalary());
    }
}


/*


C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac EmployeeDemo.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java EmployeeDemo
Rahul Net Salary = 22000.0
Riya Net Salary = 15750.0


*/