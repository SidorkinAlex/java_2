package com.company;

public class Treadmill implements Obstacle {
    public int size = 0;
    public String obstacleName = "Treadmill";

    public Treadmill() {
        size = (int) (Math.random() * 510);
    }

    @Override
    public boolean overcome(RunJamp runJamp) {
        return runJamp.run(size, obstacleName);
    }
}
