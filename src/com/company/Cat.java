package com.company;

public class Cat implements RunJamp {
    public int limitJump = 0;
    public int limitRun = 0;

    public Cat() {
        limitJump = (int) (Math.random() * 5);
        limitRun = (int) (Math.random() * 20);
    }

    @Override
    public boolean jump(int size, String obstacleName) {
        if (size <= limitJump) {
            System.out.println("Cat jumped over " + obstacleName + " height " + size);
            return true;
        }
        System.out.println("Cat could not jump " + obstacleName + " height " + size);
        return false;
    }

    @Override
    public boolean run(int size, String obstacleName) {
        if (size <= limitRun) {
            System.out.println("Robot ran on the " + obstacleName + size + " meters long");
            return true;
        }
        System.out.println("Robot could not run along a " + obstacleName + size + " meters long");
        return false;
    }
}
