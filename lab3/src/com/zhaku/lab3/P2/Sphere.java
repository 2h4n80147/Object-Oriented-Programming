package com.zhaku.lab3.P2;

public class Sphere extends Shape {

    @Override
    String volume() {
        return  "V = (4 ⁄ 3) π r^3";

    }

    @Override
    String surfaceArea() {
        return "A = 4 π r^2";
    }

    @Override
    String moreFormulas() {
        return "https://byjus.com/sphere-formula/";
    }
}
