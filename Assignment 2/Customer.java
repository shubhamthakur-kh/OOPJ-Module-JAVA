/*
Problem 7: Indian Movie Ticket Booking 
Scenario: 
A cinema hall offers Normal and Premium tickets. A customer can book just name or name with 
ticket type. Keep track of total tickets sold using a static counter. 
Tasks: 
1. Create a Customer class. 
2. Implement two constructors: 
Constructor 1 → Customer(String name) 
Constructor 2 → Customer(String name, String ticketType) 
3. Static counter to track tickets sold. 
4. Print customer details and total tickets sold. 
Input Example: 
Customer1: "Rahul" 
Customer2: "Pooja", "Premium" 
Customer3: "Amit" 
Expected Output: 
Customer1: Name: Rahul, Ticket: Normal 
Customer2: Name: Pooja, Ticket: Premium 
Customer3: Name: Amit, Ticket: Normal 
Total Tickets Sold: 3 
*/
class Customer {
     String name;
     String ticketType;

     static int totalTicketsSold = 0;

    public Customer(String name) {
        this.name = name;
        this.ticketType = "Normal"; 
        totalTicketsSold++;
    }

    Customer(String name, String ticketType) {
        this.name = name;
        this.ticketType = ticketType;
        totalTicketsSold++;
    }

    void showDetails() {
        System.out.println("Name: " + name + ", Ticket: " + ticketType);
    }

    static void showTotalTicketsSold() {
        System.out.println("Total Tickets Sold: " + totalTicketsSold);
    }
	
    public static void main(String[] args) {
        // Creating customers using both constructors
        Customer c1 = new Customer("Rahul");
        Customer c2 = new Customer("Pooja", "Premium");
        Customer c3 = new Customer("Amit");

        // Displaying customer details
        System.out.print("Customer1: "); c1.showDetails();
        System.out.print("Customer2: "); c2.showDetails();
        System.out.print("Customer3: "); c3.showDetails();

        // Displaying total tickets sold
        Customer.showTotalTicketsSold();
    }
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>javac Customer.java
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>java Customer
Customer1: Name: Rahul, Ticket: Normal
Customer2: Name: Pooja, Ticket: Premium
Customer3: Name: Amit, Ticket: Normal
Total Tickets Sold: 3
*/
