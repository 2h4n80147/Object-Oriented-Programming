package com.zhaku.lab3.P5;

public class Person {
    private String name;
    private String address;

    Person (String name, String address) {
        setAddress(address);
        setName(name);
    }

    @Override
    public String toString() {
        return String.format("Person[name=%s,address=%s]", name, address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
