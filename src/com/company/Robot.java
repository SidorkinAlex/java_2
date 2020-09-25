package com.company;

public class Robot implements RunJamp {
    @Override
    public void jump() {
        System.out.println("Robot jump");
    }

    @Override
    public void run() {
        System.out.println("Robot run");
    }
}
