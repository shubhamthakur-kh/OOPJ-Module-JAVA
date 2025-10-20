/*

17. Vehicle Speed Display  
Scenario: Vehicle management system needs to display speed differently for different vehicle types. 
Problem Statement: 
Create class Vehicle with method displaySpeed(). Subclass Car and Bike override it. 
Classes/Fields: 
● Vehicle → displaySpeed() prints “Vehicle speed unknown” 
● Car → overrides displaySpeed() → “Car speed 120 km/h” 
● Bike → overrides displaySpeed() → “Bike speed 80 km/h” 
Sample Input: 
Car 
Bike 
Sample Output: 
Car speed 120 km/h 
Bike speed 80 km/h

*/

class Vehicle {
    void displaySpeed() {
        System.out.println("Vehicle speed unknown");
    }
}

class Car extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("Car speed 120 km/h");
    }
}

class Bike extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("Bike speed 80 km/h");
    }
}

public class VehicleSpeed{
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.displaySpeed();
        v2.displaySpeed();
    }
}


/*
C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac VehicleSpeed.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java VehicleSpeed
Car speed 120 km/h
Bike speed 80 km/h

*/