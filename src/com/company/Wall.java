package com.company;

public class Wall implements Obstacle {
    public int size = 0;
    public String obstacleName = "Wall";

    public Wall() {
        size = (int) (Math.random() * 52);
    }

    @Override
    public boolean overcome(RunJamp runJamp) {
        return runJamp.jump(size, obstacleName);
    }
}
