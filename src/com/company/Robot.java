package com.company;

public class Robot implements RunJamp {
    public int limitJump = 0;
    public int limitRun = 0;

    public Robot() {
        limitJump = (int) (Math.random() * 50);
        limitRun = (int) (Math.random() * 200);
    }

    @Override
    public boolean jump(int size, String obstacleName) {
        if (size <= limitJump) {
            System.out.println("Robot jumped over " + obstacleName + " height " + size);
            return true;
        }
        System.out.println("Robot could not jump " + obstacleName + " height " + size);
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
