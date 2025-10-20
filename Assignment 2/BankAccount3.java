/*
Problem 13: Bank Deposit & Withdrawal 
Scenario: 
Extend previous problem. Add methods: 
● deposit(double amount) → adds to balance 
● withdraw(double amount) → subtracts from balance 
● Create two accounts, perform deposit/withdraw, display updated balance.
*/
class BankAccount3 {
    String accountHolder;
    double balance;

    BankAccount3(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void showDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
	
    public static void main(String[] args) {
        BankAccount3 acc1 = new BankAccount3("Rohit", 5000.0);
        BankAccount3 acc2 = new BankAccount3("Priya", 15000.0);

        acc1.deposit(2000.0);   
        acc2.withdraw(3000.0); 

        acc1.showDetails();
        acc2.showDetails();
    }
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 2>java BankAccount3
Account Holder: Rohit, Balance: 7000.0
Account Holder: Priya, Balance: 12000.0
*/

