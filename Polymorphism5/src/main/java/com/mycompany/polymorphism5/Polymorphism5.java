/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymorphism5;

class Account {
    protected double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
    }

    void withdraw(double amount) {
        System.out.println("Withdrawal not defined for generic account");
    }
}

class SavingsAccount extends Account {
    private double minimumBalance;

    SavingsAccount(double balance, double minimumBalance) {
        super(balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Savings Account: Withdrawn: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Savings Account: Withdrawal denied. Minimum balance requirement not met.");
        }
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit;

    CheckingAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Checking Account: Withdrawn: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Checking Account: Withdrawal denied. Overdraft limit exceeded.");
        }
    }
}

public class Polymorphism5 {
    public static void main(String[] args)  {
            Account [] accounts={ new SavingsAccount(5000,500),new CheckingAccount(7000,2000)  };

        for(Account account: accounts)
        {
            account.deposit(3000);
            account.withdraw(9000);
        }
    }
    }

