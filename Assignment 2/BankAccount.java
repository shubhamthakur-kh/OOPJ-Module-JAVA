/*
Problem 8: Bank Account Initialization 
Scenario: 
A bank wants to initialize the interest rate for all accounts once when the system starts. Each account 
has account holder name, balance, and interest rate. Students should practice static blocks for 
initialization and setters/getters to modify and access account details. 
Tasks: 
1. Create a BankAccount class. 
2. Use a static block to initialize interest rate to 4%. 
3. Create instance variables: name (String) and balance (double). 
4. Create setters and getters for name and balance. 
5. Print account details including interest rate. 
Input Example: 
Account1: Name="Rohit", Balance=5000 
Account2: Name="Priya", Balance=15000 
Expected Output: 
Bank Interest Rate Initialized: 4.0% 
Account1: Name=Rohit, Balance=5000.0, Interest Rate=4.0% 
Account2: Name=Priya, Balance=15000.0, Interest Rate=4.0%
*/
class BankAccount {
    String name;
    double balance;
    static double interestRate;

    static {
        interestRate = 4.0;
        System.out.println("Bank Interest Rate Initialized: " + interestRate + "%");
    }

	BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

 
    void setName(String name) {
        this.name = name;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    // Getters
    String getName() {
        return name;
    }

    double getBalance() {
        return balance;
    }

    static double getInterestRate() {
        return interestRate;
    }

    // Method to display account details
    public void showAccountDetails() {
        System.out.println("Name=" + name + ", Balance=" + balance + ", Interest Rate=" + interestRate + "%");
    }
	
    public static void main(String[] args) {
        // Creating accounts
        BankAccount acc1 = new BankAccount("Rohit", 5000);
        BankAccount acc2 = new BankAccount("Priya", 15000);

        // Displaying account details
        System.out.print("Account1: "); acc1.showAccountDetails();
        System.out.print("Account2: "); acc2.showAccountDetails();
    }
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>javac BankAccount.java
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>java BankAccount
Bank Interest Rate Initialized: 4.0%
Account1: Name=Rohit, Balance=5000.0, Interest Rate=4.0%
Account2: Name=Priya, Balance=15000.0, Interest Rate=4.0%
*/

