/*

20. College Staff Hierarchy  
Scenario: A college has employees who can be Teaching or Non-Teaching. Teaching staff can be 
Professors or Lecturers. 
Problem Statement: 
Create classes: 
● Employee → name, salary, displaySalary() 
● TeachingStaff → subject, overrides displaySalary() 
● Professor → specialization, overrides displaySalary() 
● Lecturer → department, overrides displaySalary() 
Sample Input: 
Professor → name=Dr. Sharma, salary=80000, subject=Math, specialization=Algebra 
Lecturer → name=Ms. Mehta, salary=50000, subject=Physics, department=Science 
Sample Output: 
Dr. Sharma → Subject=Math, Specialization=Algebra, Salary=80000 
Ms. Mehta → Subject=Physics, Department=Science, Salary=50000

*/

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println(name + " → Salary=" + (int)salary);
    }
}

class TeachingStaff extends Employee {
    String subject;

    TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    @Override
    void displaySalary() {
        System.out.println(name + " → Subject=" + subject + ", Salary=" + (int)salary);
    }
}

class Professor extends TeachingStaff {
    String specialization;

    Professor(String name, double salary, String subject, String specialization) {
        super(name, salary, subject);
        this.specialization = specialization;
    }

    @Override
    void displaySalary() {
        System.out.println(name + " → Subject=" + subject + ", Specialization=" + specialization + ", Salary=" + (int)salary);
    }
}

class Lecturer extends TeachingStaff {
    String department;

    Lecturer(String name, double salary, String subject, String department) {
        super(name, salary, subject);
        this.department = department;
    }

    @Override
    void displaySalary() {
        System.out.println(name + " → Subject=" + subject + ", Department=" + department + ", Salary=" + (int)salary);
    }
}

public class ClgStaff {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Sharma", 80000, "Math", "Algebra");
        Lecturer lect = new Lecturer("Ms. Mehta", 50000, "Physics", "Science");

        prof.displaySalary();
        lect.displaySalary();
    }
}


/*

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac ClgStaff.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java ClgStaff
Dr. Sharma ? Subject=Math, Specialization=Algebra, Salary=80000
Ms. Mehta ? Subject=Physics, Department=Science, Salary=50000

*/