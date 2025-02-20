/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exception5;

// Custom Exception Classes
class PaymentException extends Exception {
    public PaymentException(String message) {
        super(message);
    }
}

//class InsufficientFundsException extends PaymentException {
//    public InsufficientFundsException(String message) {
//        super(message);
//    }
//}

// Base Payment Class
abstract class Payment {
    public abstract void processPayment(double amount) throws PaymentException;
}

// CreditCard Class
class CreditCard extends Payment {
    private double creditLimit;

    public CreditCard(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public void processPayment(double amount) throws PaymentException {
        if (amount > creditLimit) {
            throw new PaymentException("Credit limit exceeded!");
        }
        creditLimit -= amount;
        System.out.println("CreditCard: Payment of $" + amount + " processed. Remaining credit limit: $" + creditLimit);
    }
}

// DebitCard Class
class DebitCard extends Payment {
    private double balance;

    public DebitCard(double balance) {
        this.balance = balance;
    }

    @Override
    public void processPayment(double amount) throws PaymentException {
        if (amount > balance) {
            throw new PaymentException("Insufficient balance in Debit Card!");
        }
        balance -= amount;
        System.out.println("DebitCard: Payment of $" + amount + " processed. Remaining balance: $" + balance);
    }
}

// PayPal Class
class PayPal extends Payment {
    private String email;
    private double balance;

    public PayPal(String email, double balance) {
        this.email = email;
        this.balance = balance;
    }

    @Override
    public void processPayment(double amount) throws PaymentException {
        if (amount > balance) {
            throw new PaymentException("Insufficient PayPal balance!");
        }
        balance -= amount;
        System.out.println("PayPal: Payment of $" + amount + " processed for " + email + ". Remaining balance: $" + balance);
    }
}

// Main Class for Testing
public class Exception5 {
    public static void main(String[] args) {
        // Create payment methods
         Payment p1=new CreditCard(5000);
         Payment p2=new DebitCard(6000);
         Payment p3=new PayPal("as",8000);
         Payment[] payments={p1,p2,p3};
         double [] amounts={4000,7000,4000};
         try
         {
             for(int i=0;i<payments.length;i++)
             {
                 payments[i].processPayment(amounts[i]);
             }
         }
         catch(PaymentException e)
         {
             System.out.println(e.getMessage());
         }
    }
}
