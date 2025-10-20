/*

15. Shape Area Calculation  
Scenario: A program needs to calculate the area of different shapes using the same method name but 
different parameters. 
Problem Statement: 
Create a class ShapeArea with overloaded methods calculateArea(). 
Methods: 
● calculateArea(int side) → calculates area of square 
● calculateArea(int length, int breadth) → calculates area of rectangle 
● calculateArea(double radius) → calculates area of circle 
Sample Input: 
Square → side=5 
Rectangle → length=4, breadth=6 
Circle → radius=3 
Sample Output: 
Square Area = 25 
Rectangle Area = 24 
Circle Area = 28.26

*/

class ShapeArea {

    int calculateArea(int side) {
        return side * side;
    }

    int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }
}

public class ShapeAreaCal{
    public static void main(String[] args) {
        ShapeArea shape = new ShapeArea();

        int squareArea = shape.calculateArea(5);
        int rectangleArea = shape.calculateArea(4, 6);
        double circleArea = shape.calculateArea(3);

        System.out.println("Square Area = " + squareArea);
        System.out.println("Rectangle Area = " + rectangleArea);
        System.out.println("Circle Area = " + circleArea);
    }
}

/*

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac ShapeAreaCal.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>
C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java ShapeAreaCal
Square Area = 25
Rectangle Area = 24
Circle Area = 9.0

*/