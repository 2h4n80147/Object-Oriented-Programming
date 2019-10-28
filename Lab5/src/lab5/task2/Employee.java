package lab5.task2;

import java.util.Date;

public class Employee extends Person implements Comparable {
    private double salary;
    private Date hireDate;
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

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }
    public Employee(Employee employee) {
        setHireDate(employee.hireDate);
        setSalary(employee.salary);
        setName(employee.name);
        setInsuranceNumber(employee.insuranceNumber);
    }

    public Employee(double salary, Date hireDate, String insuranceNumber) {
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }


    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    @Override
    public String toString() {
        return "Employee(" + name  + " " + hireDate + " " + salary + " " + insuranceNumber + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == Employee.class) {
            Employee b = (Employee)obj;
            return (b.name.equals(name) && hireDate .equals( b.hireDate) && salary == b.salary && insuranceNumber.equals(b.insuranceNumber));
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        Employee otherEmployee = (Employee) o;
        if (this.salary > otherEmployee.salary)
            return 1;
        else
        if (this.salary == otherEmployee.salary)
            return 0;
        else
            return -1;

    }
}