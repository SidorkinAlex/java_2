package com.company;

public interface RunJamp {
    /**
     *  првжек для участников преодоления припятстрия
     * @param size высота препятствия , через которое нужно перепрыгнуть
     * @param obstacleName  название препятствия через которое нуно перепрыгнуть
     * @return boolean результат преодоления препятствия
     */
    boolean jump(int size, String obstacleName);

    /**
     * бег для участников преодоления препятствия
     * @param size длина объекта, который необходимо пробежать
     * @param obstacleName название объекта, который необходимо пробежать
     * @return boolean результат преодоление препятствия
     */
    boolean run(int size, String obstacleName);
}
