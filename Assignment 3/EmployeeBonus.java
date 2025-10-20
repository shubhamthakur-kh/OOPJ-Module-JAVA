/*

14. Employee Bonus Calculation 
Scenario: A company has different types of employees with specific bonus calculation rules. 
Problem Statement: 
Create an abstract class Employee with abstract method calculateBonus(). Subclass Manager → 
bonus=20% of salary, Subclass Developer → bonus=10% of salary. 
Classes/Fields: 
● Employee → name, salary, calculateBonus() (abstract) 
● Manager → bonus=20% of salary 
● Developer → bonus=10% of salary 
Sample Input: 
Manager → name=Anita, salary=50000 
Developer → name=Rohit, salary=40000 
Sample Output: 
Anita Bonus = 10000 
Rohit Bonus = 4000 

*/

abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void calculateBonus();
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    void calculateBonus() {
        double bonus = salary * 0.20;
        System.out.println(name + " Bonus = " + (int)bonus);
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    void calculateBonus() {
        double bonus = salary * 0.10;
        System.out.println(name + " Bonus = " + (int)bonus);
    }
}

public class EmployeeBonus {
    public static void main(String[] args) {
        Employee e1 = new Manager("Anita", 50000);
        Employee e2 = new Developer("Rohit", 40000);

        e1.calculateBonus();
        e2.calculateBonus();
    }
}

/*

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac EmployeeBonus.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java EmployeeBonus
Anita Bonus = 10000
Rohit Bonus = 4000

*/
