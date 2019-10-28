package com.company.lab4.task1;

public class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getLetter(int best) {
        if (score >= best - 10)
            return "A";
        if (score >= best - 20)
            return "B";
        if (score >= best - 30)
            return "C";
        if (score >= best - 40)
            return "D";
        return "F";
    }

}
