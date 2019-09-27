package com.zhaku.lab3.P2;

public class Cube extends Shape {

    @Override
    String volume() {
        return "V = a^3";
    }

    @Override
    String surfaceArea() {
        return "A = 6 * a^2";
    }

    @Override
    String moreFormulas() {
        return "https://www.science.co.il/formula/";
    }
}
