/*
Problem 12: Bank Account Basic Info 
Scenario: 
Create BankAccount class with accountHolder and balance. 
● Use parameterized constructor to initialize account. 
● Create getter and setter for balance. 
● In main, create one account and display details. 
*/
class BankAccount2 {
    String accountHolder;
    double balance;

    // Parameterized constructor
    BankAccount2(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter and Setter for balance
    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to display account details
    void showDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
	
    public static void main(String[] args) {
        BankAccount2 acc = new BankAccount2("Rohit", 5000.0);
        acc.showDetails();
    }
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>javac BankAccount2.java
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>java BankAccount2
Account Holder: Rohit, Balance: 5000.0
*/
