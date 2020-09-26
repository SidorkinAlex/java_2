package com.company;

public class Wall implements Obstacle {
    public int size = 0;
    public String obstacleName = "Wall";

    public Wall() {
        size = (int) (Math.random() * 52);
    }

    @Override
    public void overcome(RunJamp runJamp) {
        runJamp.jump(size, obstacleName);
    }
}
