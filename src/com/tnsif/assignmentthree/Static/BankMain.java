package com.tnsif.assignmentthree.Static;

/**
 * Main class to test the static features of the Bank class.
 */
public class BankMain {
    public static void main(String[] args) {
        // Create first bank account
        Bank acc1 = new Bank("Alice", 5000);
        acc1.displayAccountInfo();

        // Create second bank account
        Bank acc2 = new Bank("Bob", 10000);
        acc2.displayAccountInfo();

        // Perform some transactions
        acc1.deposit(2000);
        acc2.withdraw(3000);

        // Display total number of accounts using static method
        System.out.println("\nTotal Bank Accounts: " + Bank.getTotalAccounts());
    }
}

