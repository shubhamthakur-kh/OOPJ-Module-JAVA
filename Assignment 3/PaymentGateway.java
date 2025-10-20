/*


24. Payment Gateway  
Scenario: An e-commerce platform supports multiple payment methods like CreditCard and PayPal. All 
payments must implement a pay() method. 
Problem Statement: 
● Create an interface Payment → method pay(double amount) 
● Classes CreditCardPayment and PayPalPayment implement Payment → provide their own pay() 
implementation 
● In main(), take payment amount and process payment using both methods 
Sample Input: 
CreditCardPayment → amount=2500 
PayPalPayment → amount=1500 
Sample Output: 
Processing Credit Card Payment of 2500 
Processing PayPal Payment of 1500


*/
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment of " + (int)amount);
    }
}

class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal Payment of " + (int)amount);
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();

        p1.pay(2500);
        p2.pay(1500);
    }
}

/*

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac PaymentGateway.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java PaymentGateway
Processing Credit Card Payment of 2500
Processing PayPal Payment of 1500

*/
