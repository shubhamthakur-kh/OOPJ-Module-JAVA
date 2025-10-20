/*

8. Vehicle Types 
Scenario: You want to categorize vehicles. 
Problem Statement: 
Create a superclass Vehicle with brand, speed. Create subclasses Car and Bike with additional modelType. 
Display details of each vehicle. 
Classes/Fields: 
● Vehicle → brand, speed 
● Car → modelType 
● Bike → modelType 
Sample Input: 
Car → brand=Honda, speed=180, modelType=Civic 
Bike → brand=Yamaha, speed=120, modelType=R15 
Sample Output: 
Car → Honda Civic, Speed=180 
Bike → Yamaha R15, Speed=120

*/

class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Car extends Vehicle {
    private String modelType;

    public Car(String brand, int speed, String modelType) {
        super(brand, speed);
        this.modelType = modelType;
    }

    public void display() {
        System.out.println("Car → " + brand + " " + modelType + ", Speed=" + speed);
    }
}

class Bike extends Vehicle {
    private String modelType;

    public Bike(String brand, int speed, String modelType) {
        super(brand, speed);
        this.modelType = modelType;
    }

    public void display() {
        System.out.println("Bike → " + brand + " " + modelType + ", Speed=" + speed);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Honda", 180, "Civic");
        Bike bike = new Bike("Yamaha", 120, "R15");

        car.display();
        bike.display();
    }
}


/*


C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac VehicleDemo.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java VehicleDemo
Car ? Honda Civic, Speed=180
Bike ? Yamaha R15, Speed=120


*/