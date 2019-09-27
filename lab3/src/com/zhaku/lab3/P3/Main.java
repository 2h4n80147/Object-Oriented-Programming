package com.zhaku.lab3.P3;

import javax.swing.plaf.basic.BasicTreeUI;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager( new Employee("Tolegen Tolemegen", 2001, 1001, "123210F"));

        manager.setBonus(200);
        Employee A = new Employee("Employee A", 2001);
        Employee B = new Employee("Employee B", 2001);
        Employee C = new Employee("Employee C", 3000);
        out.println(A.toString());
        out.println(B.toString());
        out.println(C.toString());
        manager.addEmployeeToTeam(A);
        manager.addEmployeeToTeam(B);
        manager.addEmployeeToTeam(C);
        out.println(manager.toString());
    }
}
