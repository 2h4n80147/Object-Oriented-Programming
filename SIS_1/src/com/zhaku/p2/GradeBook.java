package com.zhaku.p2;
import lab2.*;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;


public class GradeBook {
    private Course course;
    private ArrayList<Student> students;
    private double sum;
    private double lowestGrade = (1<<30), highestGrade = 0;
    private Student s1, s2;
    private int gradeBar[] = new int[11];


    public void displayMessage(){
        out.println("Welcome to the grade book for " + course.getName() + "!" );;
    }
    public void displayGradeReport() {
        out.printf("Class average is %f. Lowest grade is %s, Highest grade is %s\n", determineClassAverage(), lowestGrade(), highestGrade());
        outputBarChart();
    }

    GradeBook (Course course, ArrayList<Student> students) {
        this.course = course;
        this.students = students;
    }
    GradeBook (Course course) {
        this.course = course;
    }
    GradeBook () {}


    public double determineClassAverage() {
        if (students.size() != 0)
            return sum / students.size();
        else
            return 0;
    }
    public String lowestGrade() {
        return Double.toString(lowestGrade) +  " (" + s1.toString() + ")";
    }
    public String highestGrade() {
        return highestGrade + " (" + s2.toString() + ")";
    }

    public void addMark (int pos, int mark) {
        Student student = students.get(pos);
        lowestGrade = Math.min (lowestGrade, mark);
        if (lowestGrade == mark)
            s1 = student;

        highestGrade = Math.max(highestGrade, mark);
        if (highestGrade == mark)
            s2 = student;

        sum += mark;
        gradeBar[mark/10]++;
    }
    public Student getStudent (int pos) {
        return students.get(pos);
    }
    public void outputBarChart() {
        out.println("Grades distribution:");
        for (int i = 0; i <= 10; i++) {


            if (i < 10)
                out.print(format(i * 10) + "-" + format(i * 10 + 9) + ": ");
            else
                out.print("100: ");

            for (int j = 0; j < gradeBar[i]; j++)
                out.print("*");
            out.print("\n");
        }
    }

    String format (int x) {
        int f = x/10;
        int s = x%10;
        return Integer.toString(f) + s;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(course.toString());
        for (int i = 0; i < students.size(); i++){
            s.append(students.toString());
        }
        return s.toString();
    }
}

