/*


6. Shape Area Calculation 
Scenario: You are designing a program to calculate areas of different shapes. 
Problem Statement: 
Create a superclass Shape with a method area(). Derive two subclasses Rectangle and Circle. Implement 
area() in each subclass. 
Classes/Fields: 
● Shape → area() (method stub) 
● Rectangle → length, breadth 
● Circle → radius 
Methods: 
● Rectangle.area() → length × breadth 
● Circle.area() → π × radius² 
Sample Input: 
Rectangle → length=5, breadth=10 
Circle → radius=7 
Sample Output: 
Rectangle Area = 50 
Circle Area = 153.86 


*/

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    private double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        System.out.println("Rectangle Area = " + rect.area());
        System.out.printf("Circle Area = %.2f\n", circle.area());
    }
}
/*


C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac ShapeDemo.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java ShapeDemo
Rectangle Area = 50.0
Circle Area = 153.94


*/