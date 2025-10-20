/*

27. Shape Area Calculator  
Scenario: A drawing application needs to calculate area for different shapes: Circle, Rectangle, and 
Square. 
Problem Statement: 
● Interface Shape → method calculateArea() 
● Classes Circle, Rectangle, Square implement Shape → provide specific area calculation 
● In main(), create objects of each shape, input dimensions, display calculated area 
Sample Input: 
Circle → radius=5 
Rectangle → length=10, breadth=5 
Square → side=4 
Sample Output: 
Circle Area = 78.5 
Rectangle Area = 50 
Square Area = 16 


*/
interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

public class ShapeAreaTest{
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(10, 5);
        Shape s = new Square(4);

        System.out.println("Circle Area = " + c.calculateArea());
        System.out.println("Rectangle Area = " + r.calculateArea());
        System.out.println("Square Area = " + s.calculateArea());
    }
}


/*

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac ShapeAreaTest.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java ShapeAreaTest
Circle Area = 78.5
Rectangle Area = 50.0
Square Area = 16.0

*/


