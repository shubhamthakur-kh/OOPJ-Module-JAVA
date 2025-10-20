/*

10. Academic Staff 
Scenario: University has teaching and non-teaching staff. 
Problem Statement: 
Superclass Staff with name, salary. Subclass TeachingStaff adds subject, Subclass NonTeachingStaff 
adds department. Display staff info. 
Classes/Fields: 
● Staff → name, salary 
● TeachingStaff → subject 
● NonTeachingStaff → department 
Sample Input: 
Teaching → name=Anita, salary=50000, subject=Math 
NonTeaching → name=Ramesh, salary=40000, department=Admin 
Sample Output: 
Anita → Math, 50000 
Ramesh → Admin, 40000

*/

class Staff {
    protected String name;
    protected double salary;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class TeachingStaff extends Staff {
    private String subject;

    public TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    public void display() {
        System.out.println(name + " → " + subject + ", " + salary);
    }
}

class NonTeachingStaff extends Staff {
    private String department;

    public NonTeachingStaff(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void display() {
        System.out.println(name + " - " + department + ", " + salary);
    }
}

public class StaffDemo {
    public static void main(String[] args) {
        TeachingStaff t1 = new TeachingStaff("Anita", 50000, "Math");
        NonTeachingStaff n1 = new NonTeachingStaff("Ramesh", 40000, "Admin");

        t1.display();
        n1.display();
    }
}

/*


C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac StaffDemo.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java StaffDemo
Anita - Math, 50000.0
Ramesh - Admin, 40000.0


*/