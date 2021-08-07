package Lesson06.homework;

import Lesson06.homework.model.Animals;

public class Dog extends Animals {
    private static int count = 0;

    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        count++;
    }

    public static int getCountDogs() {
        return count;
    }


}
