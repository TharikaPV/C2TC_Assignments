package com.tnsif.assignmenttwo;

public class AssignmentMain {
    public static void main(String[] args) {
        // Create Student object (will print message)
        Student student = new Student();

        // Create Commission object
        Commission emp = new Commission();

        // Accept details and calculate commission
        emp.acceptDetails();
        emp.calculateCommission();
    }
}

