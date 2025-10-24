package com.tnsif.assignmentthree.Abstract;

/**
 * Abstract class Account representing a bank account.
 */
public abstract class Account {
    protected String accountHolderName;
    protected double balance;

    // Constructor
    public Account(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // Concrete method - common functionality
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: ₹" + balance);
    }
}
