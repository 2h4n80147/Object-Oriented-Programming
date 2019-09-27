package com.zhaku.lab3.P3;

import java.time.temporal.Temporal;
import java.util.Vector;

public class   Manager extends Employee {
    private Vector<Employee> team = new Vector<Employee>();
    private int bonus;
    public void addEmployeeToTeam(Employee employee) {
        team.add(employee);
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setTeam(Vector<Employee> team) {
        this.team = team;
    }

    public Manager(Vector<Employee> team, int bonus) {
        this.team = team;
        this.bonus = bonus;
    }

    public Manager(String name, String insuranceNumber, Vector<Employee> team, int bonus) {
        super(name, insuranceNumber);
        this.team = team;
        this.bonus = bonus;
    }
    public Manager (Employee employee) {
        super(employee);
    }

    public Manager(Vector<Employee> team) {
        this.team = team;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Manager : {");
        builder.append(super.toString());

        builder.append("(Team) : {");
        for (Employee employee : team) {
            builder.append(employee.toString() + ", ");
        }
        builder.append("}");
        builder.append(";");
        builder.append("}");
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        Manager anotherManager = (Manager)obj;
        return (anotherManager.name.equals(name) && anotherManager.team.equals(team));
    }
}
