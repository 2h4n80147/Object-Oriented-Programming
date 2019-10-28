package lab5.task2;


import java.util.Date;
import java.util.Vector;

public class   Manager extends Employee implements Comparable {
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

    public Manager(String name, double salary, Date date, String insuranceNumber,  int bonus) {
        super(name, salary, date, insuranceNumber);
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

    @Override
    public int compareTo(Object o) {
        Manager otherManager = (Manager)o;
        int employeeCompare = super.compareTo(otherManager);
        if (employeeCompare != 0)
            return employeeCompare;

        if (this.bonus > otherManager.bonus)
            return 1;
        else if (this.bonus == otherManager.bonus)
            return 0;
        else return -1;

   }
}
