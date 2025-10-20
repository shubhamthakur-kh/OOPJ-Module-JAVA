/*


1. Bank Account Protection 
Scenario: You are creating a simple banking system. A user should not be able to directly change their 
balance. 
Problem Statement: 
Create a class BankAccount with a private variable balance. Provide deposit() and withdraw() methods to 
change balance. Provide a getter to view balance. Validate that withdrawal cannot exceed balance. 
Class/Fields: 
● private double balance 
Methods: 
● deposit(double amount) → add to balance 
● withdraw(double amount) → subtract from balance if sufficient 
● getBalance() → returns current balance 
Sample Input: 
Deposit = 5000 
Withdraw = 2000 
Sample Output: 
Updated Balance = 3000


*/


class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited = " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn = " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(5000);
        account.withdraw(2000);
        System.out.println("Updated Balance = " + account.getBalance());
    }
}
/*



C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac BankAccount.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java BankAccount
Deposited = 5000.0
Withdrawn = 2000.0
Updated Balance = 3000.0


*/

