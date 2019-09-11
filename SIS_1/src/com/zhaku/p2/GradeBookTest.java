package com.zhaku.p2;

import lab2.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {

        Random rng = new Random();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String name =  "";
            char x = (char)(65 + i);
            name = name + x;
            Student student = new Student(name, Integer.toString(rng.nextInt(2019)));
            students.add(student);
        }

        Course course = new Course("Algebra 10001", "nothing interesting", 3, new ArrayList<>());

        GradeBook gradeBook = new GradeBook(course, students);

        gradeBook.displayMessage();

        Scanner in = new Scanner(System.in);

        System.out.println("Please, input grades for students:");
        for (int i = 0; i < 10; i++) {

            System.out.printf("Student %s: ", gradeBook.getStudent(i).getName());
            int mark = in.nextInt();
            gradeBook.addMark(i,mark);
        }
        gradeBook.displayGradeReport();
    }
}
