package com.company;

public class Cat implements RunJamp {


    @Override
    public void jump() {
        System.out.println("Cat jump");
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }
}
