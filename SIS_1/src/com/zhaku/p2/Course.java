package com.zhaku.p2;

import com.sun.source.tree.UsesTree;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.CheckedOutputStream;

public class Course{
    private String name;
    private String description;
    private int numberOfCredits;
    private ArrayList<String> prerequisites;

    Course() {}

    Course(String name) {
        setName(name);
    }
    Course (String name, String description, int numberOfCredits, ArrayList<String> prerequisites) {
        setName(name);
        setDescription(description);
        setNumberOfCredits(numberOfCredits);
        setPrerequisites(prerequisites);
    }

    @Override
    public String toString() {
        return "Course : " + name;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public List<String> getPrerequisites() {
        return prerequisites;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public void setPrerequisites(ArrayList<String> prerequisites) {
        this.prerequisites = prerequisites;
    }
}