package com.zhaku.p3;

public class Person {
    Gender gender;
    String name;
    Person(String name, Gender gender) {
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + gender;
    }
}
