package com.zhaku.lab3.P1;

import com.zhaku.lab3.P1.Animal;

public class Pigman extends Animal {
    Pigman(String name) {
        super(name);
    }
    Pigman() {
        super();
    }

    @Override
    public void speak() {
        System.out.println("Hroo hroo");
    }
    public void speakParentLanguage() {

        System.out.println(name + " speaks parent language;" );
        super.speak();
    }
    public void speak (int times) {
        for (int i = 0; i < times; i++)
            speak();;
    }

}
