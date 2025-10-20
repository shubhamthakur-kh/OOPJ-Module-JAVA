class Account {
    int accountNo;
    double balance;

    Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account → " + accountNo + ", Balance=" + balance);
    }
}

class SavingAccount extends Account {
    double interestRate;

    SavingAccount(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    void display() {
        System.out.println("Saving → " + accountNo + ", Balance=" + balance + ", Interest=" + interestRate + "%");
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void display() {
        System.out.println("Current → " + accountNo + ", Balance=" + balance + ", Overdraft=" + overdraftLimit);
    }
}

public class BankAccountTypes{
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount(101, 5000, 5);
        CurrentAccount c = new CurrentAccount(102, 10000, 2000);

        s.display();
        c.display();
    }
}

/*

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac BankAccountTypes.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java BankAccountTypes
Saving ? 101, Balance=5000.0, Interest=5.0%
Current ? 102, Balance=10000.0, Overdraft=2000.0

*/

