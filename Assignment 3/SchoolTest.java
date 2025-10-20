/*

23. School Members  
Scenario: School has members: Teachers, Students, and Staff. All share common info. 
Problem Statement: 
● Member → name, id, displayInfo() 
● Teacher → subject, overrides displayInfo() 
● Student → grade, overrides displayInfo() 
● Staff → department, overrides displayInfo() 
Sample Input: 
Teacher → name=Mr. Kumar, id=101, subject=English 
Student → name=Riya, id=201, grade=10 
Staff → name=Mr. Das, id=301, department=Maintenance 
Sample Output: 
Mr. Kumar → ID=101, Subject=English 
Riya → ID=201, Grade=10 
Mr. Das → ID=301, Department=Maintenance

*/

class Member {
    String name;
    int id;

    Member(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println(name + " - ID=" + id);
    }
}

class Teacher extends Member {
    String subject;

    Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " - ID=" + id + ", Subject=" + subject);
    }
}

class Student extends Member {
    int grade;

    Student(String name, int id, int grade) {
        super(name, id);
        this.grade = grade;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " → ID=" + id + ", Grade=" + grade);
    }
}

class Staff extends Member {
    String department;

    Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " - ID=" + id + ", Department=" + department);
    }
}

public class SchoolTest {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Kumar", 101, "English");
        Student s = new Student("Riya", 201, 10);
        Staff st = new Staff("Mr. Das", 301, "Maintenance");

        t.displayInfo();
        s.displayInfo();
        st.displayInfo();
    }
}

/*

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac SchoolTest.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java SchoolTest
Mr. Kumar ? ID=101, Subject=English
Riya ? ID=201, Grade=10
Mr. Das ? ID=301, Department=Maintenance
 
*/