package com.company.lab4.task1;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class Second {

    public static void main(String[] args) {
        // write your code here

        try {
            FileReader fr = new FileReader("C:\\Users\\Asus\\IdeaProjects\\Lab4\\src\\com\\company\\lab4\\task1\\scores.txt");
            FileWriter fw = new FileWriter("C:\\Users\\Asus\\IdeaProjects\\Lab4\\src\\com\\company\\lab4\\task1\\grades.txt", true);
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            String line = br.readLine();
            int sum = 0;
            int numberOfStudents = 0;
            int max = 0;
            int min = (int) 1e9;
            while (line != null) {
                Scanner sc = new Scanner(line);
                String firstname = sc.next();
                String lastname = sc.next();
                int score = sc.nextInt();

                sum += score;
                numberOfStudents++;
                max = max(max, score);
                min = min(min, score);

                line = br.readLine();
                sc.close();
            }
            double average = sum * 1.0 / numberOfStudents;
            bw.write("\n" + "Average - " + average + "\n" + "Maximum - " + max + "\n" + "Minimum - " + min);

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
