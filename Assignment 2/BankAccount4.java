/*
Problem 14: Bank Name Display 
Scenario: 
Add a static variable bankName = "CDAC Bank" and static method displayBankName() to 
BankAccount. 
● Call displayBankName() from main. 
● Create one account to verify instance creation. 
*/
class BankAccount4 {
    String accountHolder;
    double balance;
    static String bankName = "CDAC Bank";

    BankAccount4(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    static void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    void showDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
	
    public static void main(String[] args) {
        BankAccount4.displayBankName(); // Static method call

        BankAccount4 acc = new BankAccount4("Rohit", 5000.0);
        acc.showDetails(); 
    }
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>javac BankAccount4.java
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>java BankAccount4
Bank Name: CDAC Bank
Account Holder: Rohit, Balance: 5000.0
*/
	
