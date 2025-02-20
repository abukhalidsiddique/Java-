 
package com.mycompany.inheritence5;

class Account {
    double balance;

    Account(double balance) {
         this.balance=balance;
    }

    void showBalance() {
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        super(balance);    }

    void addInterest(double interestRate) {
        balance += balance * interestRate / 100;
        System.out.println("Interest added. New balance: $" + balance);
    }
}

class CheckingAccount extends Account {
    CheckingAccount(double balance) {
        super(balance);
    }

    void deductFees(double fee) {
        balance -= fee;
        System.out.println("Fees deducted. New balance: $" + balance);
    }
}

public class Inheritence5 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000);
        CheckingAccount checking = new CheckingAccount(500);

        savings.showBalance();
        savings.addInterest(5);

        checking.showBalance();
        checking.deductFees(50);
    }
}
