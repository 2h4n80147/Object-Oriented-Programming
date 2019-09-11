package com.zhaku.p3;

public class p3 {
    public static void main(String[] args) {
        DragonLaunch dragonLaunch = new DragonLaunch();
        dragonLaunch.kidnap(new Person("A", Gender.BOY));
        dragonLaunch.kidnap(new Person("B", Gender.BOY));
        dragonLaunch.kidnap(new Person("C", Gender.GIRL));
        dragonLaunch.kidnap(new Person("D", Gender.GIRL));

        System.out.print(dragonLaunch.willDragonEatOrNot());
    }
}
