package com.company;

public class Man implements RunJamp {
    public int limitJump = 0;
    public int limitRun = 0;

    public Man() {
        limitJump = (int) (Math.random() * 30);
        limitRun = (int) (Math.random() * 500);
    }

    @Override
    public boolean jump(int size, String obstacleName) {
        if (size <= limitJump) {
            System.out.println("Man jumped over " + obstacleName + " height " + size);
            return true;
        }
        System.out.println("Man could not jump " + obstacleName + " height " + size);
        return false;
    }

    @Override
    public boolean run(int size, String obstacleName) {
        if (size <= limitRun) {
            System.out.println("Man ran on the " + obstacleName + size + " meters long");
            return true;
        }
        System.out.println("Man could not run along a " + obstacleName + size + " meters long");
        return false;
    }
}
