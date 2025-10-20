/*
class Student {
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Please enter between 0 and 100.");
        }
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setMarks(85);
        System.out.println("Marks = " + s1.getMarks());
    }
}

*/

class Student {
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Please enter between 0 and 100.");
        }
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setMarks(85);
        System.out.println("Marks = " + s1.getMarks());
    }
}




/*


C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac Student.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java Student
Marks = 85


*/