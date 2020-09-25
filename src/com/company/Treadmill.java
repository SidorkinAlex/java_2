package com.company;

public class Treadmill implements Obstacle {
    public int longTreadmill=0;
    @Override
    public void overcome(RunJamp runJamp) {
        runJamp.run();
    }
}
