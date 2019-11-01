package com.security.model.domain;

public class Employee {

    private int employeeId;
    private String employeeeFirstName;
    private String employeeLastName;

    public Employee(int employeeId, String employeeeFirstName, String employeeLastName) {
        this.employeeId = employeeId;
        this.employeeeFirstName = employeeeFirstName;
        this.employeeLastName = employeeLastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeeFirstName() {
        return employeeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }
}
