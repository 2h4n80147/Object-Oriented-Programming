package com.zhaku.lab3.P3;

import java.util.EnumMap;

public class Employee extends Person{
    private double salary;
    private int year;
    private String insuranceNumber;
    Employee() {
        super();
    }
    Employee (String name) {
        super(name);
    }
    public Employee(String name, String insuranceNumber) {
        super(name);
        this.insuranceNumber = insuranceNumber;
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public Employee(String name, int year, double salary, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.year = year;
        this.insuranceNumber = insuranceNumber;
    }
    public Employee (Employee employee) {
        setYear(employee.year);
        setSalary(employee.salary);
        setName(employee.name);
        setInsuranceNumber(employee.insuranceNumber);
    }

    public Employee(double salary, int year, String insuranceNumber) {
        this.salary = salary;
        this.year = year;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public int getYear() {
        return year;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Employee(" + name  + " " + year + " " + salary + " " + insuranceNumber + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == Employee.class) {
            Employee b = (Employee)obj;
            return (b.name.equals( name) && year == b.year && salary == b.salary && insuranceNumber.equals(b.insuranceNumber));
        }
        return false;
    }
}
