 
package com.mycompany.polymorphism6;

import java.util.*;
abstract class BankAccount
{
    double amount;
    BankAccount(double amount)
    {
        this.amount=amount;
    }
    abstract void deposit(double amount);
    abstract double getBalance();    
}

class SavingsAccount extends BankAccount
{
    SavingsAccount(double amount)
    {
        super(amount);
    }
    @Override
    void deposit(double x)
    {
        amount+=amount*x;
    }
    @Override
    double getBalance()
    {
        return amount;
    }   
}
class CheckingAccount extends BankAccount
{
    CheckingAccount(double amount)
    {
        super(amount);
    }
    @Override
    void deposit(double x)
    {
        amount+=amount*x;
    }
    @Override
    double getBalance()
    {
        return amount;
    }   
}
public class Polymorphism6 {

    public static void main(String[] args) {
         BankAccount[] accounts= new BankAccount[2];
         accounts[0]=new SavingsAccount(5000);
         accounts[1]=new CheckingAccount(8000);
         accounts[0].deposit(0.4);
         System.out.println("BALANCE: "+accounts[0].getBalance()); 
         accounts[1].deposit(0.4);
         System.out.println("BALANCE: "+accounts[1].getBalance());
         
         
//         for(BankAccount account:accounts)
//         {
//             account.deposit(0.4);
//             System.out.println("Balance: "+account.getBalance());
//         }
    }
}
