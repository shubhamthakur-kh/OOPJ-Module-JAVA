/*
28. Online Shopping Cart System 
Scenario: Build a simplified shopping cart system where users can add products, calculate total cost, and 
apply discounts. 
Problem Statement: 
● Class Product → instance variables: productId, name, price (Encapsulation: use private variables 
with getters/setters) 
● Abstract Class CartItem → method calculateTotalPrice() (Abstract Class: define generic 
behavior for cart items) 
● Class Cart extends CartItem → store list of products, implement calculateTotalPrice() 
● Interface Discountable → method applyDiscount(double percentage) (Interface: any item can 
have discounts applied) 
In main(), create a cart, add 3 products, apply 10% discount to one product, display total cost 
Sample Input: 
Product1 → name="Laptop", price=50000 
Product2 → name="Mouse", price=500 
Product3 → name="Keyboard", price=1200
*/

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

interface Discountable {
    void applyDiscount(double percentage);
}

abstract class CartItem {
    abstract double calculateTotalPrice();
}

class Cart extends CartItem {
    List<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    @Override
    double calculateTotalPrice() {
        double total = 0;
        for (Product p : products) total += p.getPrice();
        return total;
    }
}

class DiscountedProduct extends Product implements Discountable {
    DiscountedProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public void applyDiscount(double percentage) {
        double newPrice = getPrice() - (getPrice() * percentage / 100);
        setPrice(newPrice);
        System.out.println("Applying " + (int)percentage + "% discount to " + getName());
    }
}

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DiscountedProduct p1 = new DiscountedProduct("Laptop", 50000);
        Product p2 = new Product("Mouse", 500);
        Product p3 = new Product("Keyboard", 1200);

        p1.applyDiscount(10); // Apply 10% discount to Laptop

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        System.out.println("Total Cart Price = " + (int)cart.calculateTotalPrice());
    }
}


/*
C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac CartTest.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java CartTest
Applying 10% discount to Laptop
Total Cart Price = 46700

*/

