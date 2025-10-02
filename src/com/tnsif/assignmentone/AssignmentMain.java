package com.tnsif.assignmentone;

import com.tnsif.assignmentone.employee.Manager;
import com.tnsif.assignmentone.employee.Developer;
import com.tnsif.assignmentone.utilities.EmployeeUtilities;

/**
 * Main class to demonstrate Java packages and access modifiers.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Create objects
        Manager mgr = new Manager("Alice", "M001", 75000, "HR");
        Developer dev = new Developer("Bob", "D001", 60000, "Java");

        // Utility object
        EmployeeUtilities util = new EmployeeUtilities();

        // Print details
        util.printEmployeeDetails(mgr);
        util.printEmployeeDetails(dev);

        // Give raises
        util.giveRaise(mgr, 5000);
        util.giveRaise(dev, 4000);
    }
}
