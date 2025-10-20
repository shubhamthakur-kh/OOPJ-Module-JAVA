/*
9. Animal Sound 
Scenario: You are building a zoo management system to play animal sounds. 
Problem Statement: 
Create a superclass Animal with method makeSound(). Subclass Dog and Cat override makeSound(). 
Classes/Fields: 
● Animal → makeSound() 
● Dog → “Bark” 
● Cat → “Meow” 
Sample Output: 
Dog → Bark 
Cat → Meow

*/
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog → Bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat → Meow");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}


/*
C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac AnimalDemo.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java AnimalDemo
Dog ? Bark
Cat ? Meow
*/