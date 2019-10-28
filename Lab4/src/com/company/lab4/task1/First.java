package com.company.lab4.task1;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

import static java.lang.Integer.max;

public class First {

    public static void main(String[] args) {
        // write your code here

        try {
            FileReader fr = new FileReader("C:\\Users\\Asus\\IdeaProjects\\Lab4\\src\\com\\company\\lab4\\task1\\scores.txt");
            FileWriter fw = new FileWriter("C:\\Users\\Asus\\IdeaProjects\\Lab4\\src\\com\\company\\lab4\\task1\\grades.txt");
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            String line = br.readLine();
            Vector<Student> students = new Vector<>();
            while (line != null) {
                Scanner sc = new Scanner(line);
                String firstname = sc.next();
                String lastname = sc.next();
                int score = sc.nextInt();
                Student student = new Student(firstname + " " + lastname, score);
                students.add(student);

                line = br.readLine();
                sc.close();
            }
            int best = 0;
            for (Student student : students) {
                best = max(best, student.getScore());
            }
            for (Student student : students) {
                bw.write(student.name + " - " + "\"" + student.getLetter(best) + "\"");
                bw.newLine();
            }
            br.close();
            fr.close();
            bw.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
