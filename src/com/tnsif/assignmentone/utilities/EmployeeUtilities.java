package com.tnsif.assignmentone.utilities;

import com.tnsif.assignmentone.employee.Employee;

/**
 * Utility class for employee operations.
 * Demonstrates access to protected/public methods.
 */
public class EmployeeUtilities {

    // Method to give a raise to employee
    public void giveRaise(Employee emp, double amount) {
        double newSalary = emp.getSalary() + amount;
        emp.setSalary(newSalary);
        System.out.println(emp.getName() + " got a raise. New Salary: " + newSalary);
    }

    // Method to display employee details
    public void printEmployeeDetails(Employee emp) {
        emp.displayInfo();
    }
}
