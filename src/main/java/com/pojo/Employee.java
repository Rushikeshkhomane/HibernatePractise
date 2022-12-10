package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeeDetails")
public class Employee {
     @Id
    private int employeeId;
    private String employeeName;
    private String employeeAddress;
    private String employeeEmailId;
    private String employeeDepartment;
    private String employeeDesignation;
    private double employeeSalary;
    private String employeeContactNumber;
    private static String companyName;

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    public Employee(int employeeId, String employeeName, String employeeAddress, String employeeEmailId, String employeeDepartment, String employeeDesignation, double employeeSalary, String employeeContactNumber) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeEmailId = employeeEmailId;
        this.employeeDepartment = employeeDepartment;
        this.employeeDesignation = employeeDesignation;
        this.employeeSalary = employeeSalary;
        this.employeeContactNumber = employeeContactNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeEmailId='" + employeeEmailId + '\'' +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeContactNumber='" + employeeContactNumber + '\'' +
                '}';
    }
}
