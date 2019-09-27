package com.zhaku.lab3.P2;

public class Cyclinder extends Shape {
    @Override
    String volume() {
        return "V=Bh  or  V=πr2h";

    }

    @Override
    String surfaceArea() {
        return "surface area = 2πr^2 + (2πr)h";
    }

    @Override
    String moreFormulas() {
        return "https://www.mathwarehouse.com/solid-geometry/cylinder/formula-area-of-cylinder.php";

    }
}
