/*
Problem 19:  Vehicle Registration – Static Block 
Scenario: 
Add a static block to Vehicle class: 
● Print "Welcome to CDAC Vehicle Registration Portal" when class loads 
● Verify that the message prints only once when multiple vehicles are created
*/
class Vehicle1 {
    String regNo;
    String ownerName;
    String vehicleType;
    static int vehicleCount = 1;

    // Static block
    static {
        System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }

    Vehicle1(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.regNo = "MH-2025-" + vehicleCount;
        vehicleCount++;
    }

    String getRegNo() { return regNo; }
    String getOwnerName() { return ownerName; }
    String getVehicleType() { return vehicleType; }

    void showDetails() {
        System.out.println("RegNo: " + regNo + ", Owner: " + ownerName + ", Type: " + vehicleType);
    }
	
    public static void main(String[] args) {
        Vehicle1 v1 = new Vehicle1("Ravi", "Car");
        Vehicle1 v2 = new Vehicle1("Anita", "Bike");

        v1.showDetails();
        v2.showDetails();
    }
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>javac Vehicle1.java
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>java Vehicle1
Welcome to CDAC Vehicle Registration Portal
RegNo: MH-2025-1, Owner: Ravi, Type: Car
RegNo: MH-2025-2, Owner: Anita, Type: Bike
*/
