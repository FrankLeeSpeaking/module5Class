package com.strausMAD105;

public class Employee {

    private String employeeName;
    private String employeeID;
    private int employeeShift;

    public Employee(String employeeName, String employeeID, int employeeShift) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.employeeShift = employeeShift;
    }// END of Employee constructor

    //----------- BEGIN get/set employeeName
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    // -------END get/set employeeName ------------

    //----------- BEGIN get/set employeeID
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    // -------END get/set employeeID ------------

    //----------- BEGIN get/set employeeShift
    public int getEmployeeShift() {
        return employeeShift;
    }

    public void setEmployeeShift(int employeeShift) {
        this.employeeShift = employeeShift;
    }
    // -------END get/set employeeShift ------------

    public void displayAll() {
        System.out.println("Name: " + getEmployeeName());
        System.out.println("Number: " + getEmployeeID());
        System.out.println("Shift: " + getEmployeeShift());
        System.out.print("\n");

    }//--------- END of class method displayAll


}// -------------- END of class Employee -----------
