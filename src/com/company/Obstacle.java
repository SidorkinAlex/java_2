package com.company;

public interface Obstacle {
    /**
     * Функция преодорления препятствия
     * @param runJamp участник, который преодолевает препятствия
     * @return boolean результат преодоления препятствия
     */
    boolean overcome(RunJamp runJamp);
}
