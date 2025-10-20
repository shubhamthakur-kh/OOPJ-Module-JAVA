/*
19. Bank Account Types  
Scenario: Bank manages different types of accounts: Savings and Current. Both share basic account 
details, but Savings accounts have interest and Current accounts have overdraft limit. 
Problem Statement: 
Create a superclass BankAccount with: 
● Fields: accountNumber, accountHolder, balance 
● Method: displayBalance() 
Create subclasses: 
● SavingsAccount → field: interestRate, method: calculateInterest() 
● CurrentAccount → field: overdraftLimit, method: checkOverdraft() 
Sample Input: 
SavingsAccount → accountNumber=101, accountHolder=Ramesh, balance=5000, interestRate=5% 
CurrentAccount → accountNumber=102, accountHolder=Anita, balance=2000, overdraftLimit=1000 
Sample Output: 
Ramesh → Balance=5000, Interest=250 
Anita → Balance=2000, Overdraft Limit=1000 

*/

class BankAcc {
    int accNo;
    String holder;
    double bal;

    BankAcc(int accNo, String holder, double bal) {
        this.accNo = accNo;
        this.holder = holder;
        this.bal = bal;
    }

    void displayBal() {
        System.out.println(holder + " → Balance=" + (int)bal);
    }
}

class SavAcc extends BankAcc {
    double ir;

    SavAcc(int accNo, String holder, double bal, double ir) {
        super(accNo, holder, bal);
        this.ir = ir;
    }

    void display() {
        double interest = bal * ir / 100;
        System.out.println(holder + " → Balance=" + (int)bal + ", Interest=" + (int)interest);
    }
}

class CurAcc extends BankAcc {
    double od;

    CurAcc(int accNo, String holder, double bal, double od) {
        super(accNo, holder, bal);
        this.od = od;
    }

    void display() {
        System.out.println(holder + " → Balance=" + (int)bal + ", Overdraft Limit=" + (int)od);
    }
}

public class BankTest {
    public static void main(String[] args) {
        SavAcc sa = new SavAcc(101, "Ramesh", 5000, 5);
        CurAcc ca = new CurAcc(102, "Anita", 2000, 1000);

        sa.display();
        ca.display();
    }
}

/*

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac  BankTest.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java  BankTest
Ramesh ? Balance=5000, Interest=250
Anita ? Balance=2000, Overdraft Limit=1000

*/