package com.zhaku.lab3.P1;


public class Animal {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Animal(String name) {
        setName(name);
    }
    Animal() {
        setName("no name");
    }

    public void speak() {

        System.out.println("No voice");
    }
}
