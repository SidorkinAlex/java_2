package com.company;

public class Treadmill implements Obstacle {
    public int size = 0;
    public String obstacleName = "Treadmill";

    public Treadmill() {
        size = (int) (Math.random() * 60);
    }

    @Override
    public void overcome(RunJamp runJamp) {
        runJamp.run(size, obstacleName);
    }
}
