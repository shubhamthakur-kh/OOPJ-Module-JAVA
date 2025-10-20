/*


21. Hospital Staff  
Scenario: Hospital has Staff members. Both Doctors and Nurses are Staff. 
Problem Statement: 
● Staff → name, staffId, displayDetails() 
● Doctor → specialization, displayDetails() override 
● Nurse → shift, displayDetails() override 
Sample Input: 
Doctor → name=Dr. Reddy, staffId=101, specialization=Cardiology 
Nurse → name=Nisha, staffId=102, shift=Night 
Sample Output: 
Dr. Reddy → Staff ID=101, Specialization=Cardiology 
Nisha → Staff ID=102, Shift=Night 


*/

class Staff {
    String name;
    int staffId;

    Staff(String name, int staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    void displayDetails() {
        System.out.println(name + " - Staff ID=" + staffId);
    }
}

class Doctor extends Staff {
    String specialization;

    Doctor(String name, int staffId, String specialization) {
        super(name, staffId);
        this.specialization = specialization;
    }

    @Override
    void displayDetails() {
        System.out.println(name + " - Staff ID=" + staffId + ", Specialization=" + specialization);
    }
}

class Nurse extends Staff {
    String shift;

    Nurse(String name, int staffId, String shift) {
        super(name, staffId);
        this.shift = shift;
    }

    @Override
    void displayDetails() {
        System.out.println(name + " - Staff ID=" + staffId + ", Shift=" + shift);
    }
}

public class HospitalStaff {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Reddy", 101, "Cardiology");
        Nurse n = new Nurse("Nisha", 102, "Night");

        d.displayDetails();
        n.displayDetails();
    }
}


/*

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac HospitalStaff.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java HospitalStaff
Dr. Reddy - Staff ID=101, Specialization=Cardiology
Nisha - Staff ID=102, Shift=Night
s

*/


