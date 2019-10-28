package lab5.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Person borya = new Person("Borya");

        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        Date date1 = df.parse("12-10-2019");
        Date date2 = df.parse("11-10-2019");
        Employee bekeEmployee = new Employee("Beke", 200.3, date1, "18BD310028");
        Employee chuEmployee = new Employee("Chu", 200.2, date2, "18BD311028");

        System.out.println(bekeEmployee.compareTo(chuEmployee));
        System.out.println(bekeEmployee.toString());
        System.out.println(chuEmployee.toString());
        System.out.println();

        Date date3 = df.parse("05-10-2010");
        Date date4 = df.parse("06-10-2010");
        Manager voopsen = new Manager("Voopsen", 151.8, date3, "01BD01234", 10);
        Manager poopsen = new Manager("Poopsen", 151.8, date4, "01BD01234", 10);
        voopsen.addEmployeeToTeam(bekeEmployee);
        voopsen.addEmployeeToTeam(chuEmployee);

        System.out.println(voopsen.compareTo(poopsen));
        System.out.println(voopsen.toString());
        System.out.print(poopsen.toString());

    }
}
