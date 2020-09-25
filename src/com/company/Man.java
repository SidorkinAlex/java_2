package com.company;

public class Man implements RunJamp {
    @Override
    public void jump() {
        System.out.println("Man jump");
    }

    @Override
    public void run() {
        System.out.println("Man run");
    }
}
