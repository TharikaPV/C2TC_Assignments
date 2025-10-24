package com.tnsif.assignmentthree.Final;

/**
 * Main class to demonstrate final keyword in transactions.
 */
public class TransactionMain {
    public static void main(String[] args) {
        // Create deposit transaction
        Transaction t1 = new Transaction("deposit", 2000, 5000);
        t1.performTransaction();

        // Create withdraw transaction
        Transaction t2 = new Transaction("withdraw", 1000, t1.getBalance());
        t2.performTransaction();

        System.out.println("\nFinal Account Balance: ₹" + t2.getBalance());
    }
}

