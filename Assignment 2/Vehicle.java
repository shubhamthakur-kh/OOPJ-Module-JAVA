/*
Problem 18:  Vehicle Registration – Static Counter 
Scenario: 
Create Vehicle class with regNo, ownerName, vehicleType. 
● Static variable: vehicleCount 
● Constructor → auto-generate regNo as "MH-2025-" + vehicleCount 
C-DAC MUMBAI
● Getter methods for all fields 
*/
class Vehicle {
    String regNo;
    String ownerName;
    String vehicleType;
    static int vehicleCount = 1;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.regNo = "MH-2025-" + vehicleCount;
        vehicleCount++;
    }

    String getRegNo() {
        return regNo;
    }

    String getOwnerName() {
        return ownerName;
    }

    String getVehicleType() {
        return vehicleType;
    }

    void showDetails() {
        System.out.println("RegNo: " + regNo + ", Owner: " + ownerName + ", Type: " + vehicleType);
    }
	
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Car");
        Vehicle v2 = new Vehicle("Anita", "Bike");

        v1.showDetails();
        v2.showDetails();
    }
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>javac Vehicle.java
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>java Vehicle
RegNo: MH-2025-1, Owner: Ravi, Type: Car
RegNo: MH-2025-2, Owner: Anita, Type: Bike
*/

