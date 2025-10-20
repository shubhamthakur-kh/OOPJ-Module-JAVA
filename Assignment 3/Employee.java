/*
3. Employee Age Validation 
Scenario: HR wants to ensure employees entered in the system are adults. 
Problem Statement: 
Create a class Employee with private age. Provide getter/setter. Setter should reject age < 18. 
Fields: 
● private int age 
Methods: 
● setAge(int age) → if age >=18, set; else show error 
● getAge() → returns age 
Sample Input: 
age = 17 
Sample Output: 
“Invalid age” 


*/
class Employee {
    private int age;

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setAge(17); 
        System.out.println("Age = " + e1.getAge());
    }
}

/*


C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac Employee.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java Employee
Invalid age
Age = 0


*/

