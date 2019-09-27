package com.zhaku.lab3.P2;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Cyclinder A = new Cyclinder();
        out.println(A.volume());
        out.println(A.surfaceArea());
        out.println(A.moreFormulas());
        Cube B = new Cube();
        out.println(B.volume());
        out.println(B.surfaceArea());
        out.println(B.moreFormulas());
        Sphere C = new Sphere();
        out.println(C.volume());
        out.println(C.surfaceArea());
        out.println(C.moreFormulas());


    }
}
