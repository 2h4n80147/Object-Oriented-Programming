package com.zhaku.lab3.P5;

import com.zhaku.lab3.P3.Employee;

import java.util.HashSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Instructions:\n" +
                "To add Person, type command: \"Person %name %address \"\n" +
                "To add Student, type command: \"Student %name %address %program %year %fee\"\n" +
                "To add Staff, type command: \"Staff %name %address %school %pay \"\n" +
                "To show added users, type command: \"show \" \n" +
                "To exit type \"0\" \n"
        );

        HashSet<Person> users = new HashSet<>();
        Scanner in = new Scanner(System.in);
        while (true) {
            String type = in.next();
            if (type.equals( "0")) {
                break;
            }
            switch (type) {
                case "Person" : {
                    String name = in.next();
                    String address = in.next();
                    Person person = new Person(name, address);
                    users.add(person);
                    System.out.println(person.toString());
                    break;
                }
                case "Student" : {
                    String name = in.next();
                    String address = in.next();
                    String program = in.next();
                    int year = in.nextInt();
                    double fee = in.nextDouble();
                    Student student = new Student(name, address, program, year, fee);
                    users.add(student);
                    System.out.println(student.toString());

                    break;
                }
                case "Staff" : {
                    String name = in.next();
                    String address = in.next();
                    String school = in.next();
                    double pay = in.nextDouble();
                    Staff staff = new Staff(name, address, school, pay);
                    users.add (staff);
                    System.out.println(staff.toString());
                    break;
                }
                case "show" : {
                    System.out.println("Users added so far: ");
                    for (var x : users) {
                        System.out.println(x.toString() );
                    }
                    System.out.println("");
                    break;
                }
                default: {
                    System.out.println("Invalid command");
                    break;
                }
            }
        }
    }
}
