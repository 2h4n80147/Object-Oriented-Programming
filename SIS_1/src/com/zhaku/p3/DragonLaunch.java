package com.zhaku.p3;

import javax.swing.*;
import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> kidnapped;
    DragonLaunch() {
        kidnapped = new Vector<>();

    }

    public void kidnap(Person p) {
        kidnapped.add(p);
        if (kidnapped.size() >= 2 && kidnapped.get(kidnapped.size()-2).gender == Gender.BOY
                && kidnapped.get(kidnapped.size()-1).gender == Gender.GIRL) {
            kidnapped.remove(kidnapped.size() - 1);
            kidnapped.remove(kidnapped.size() - 1);
        }
    }
    public String willDragonEatOrNot() {
        if (kidnapped.size() >= 1)
            return "Yes";
        else return "No";

    }
}
