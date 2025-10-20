/*

13. Shape Drawing 
Scenario: A graphics program needs to draw different shapes. 
Problem Statement: 
Create an abstract class Shape with abstract method draw(). Subclass Circle and Rectangle implement 
draw(). 
Classes/Fields: 
● Shape → draw() (abstract) 
● Circle → radius 
● Rectangle → length, breadth 
Sample Input: 
Circle → radius=7 
Rectangle → length=5, breadth=10 
Sample Output: 
Drawing Circle of radius 7 
Drawing Rectangle of length 5 and breadth 10 

*/


abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Drawing Circle of radius " + radius);
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void draw() {
        System.out.println("Drawing Rectangle of length " + length + " and breadth " + breadth);
    }
}

public class ShapeDrawing {
    public static void main(String[] args) {
        Shape s1 = new Circle(7);
        Shape s2 = new Rectangle(5, 10);

        s1.draw();
        s2.draw();
    }
}

/*

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac ShapeDrawing.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java ShapeDrawing
Drawing Circle of radius 7
Drawing Rectangle of length 5 and breadth 10

*/


