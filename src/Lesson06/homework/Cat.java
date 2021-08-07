package Lesson06.homework;

import Lesson06.homework.model.Animals;

public class Cat extends Animals {
    private static int count = 0;

    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        count++;
    }

    public static int getCountCats() {
        return count;
    }

    @Override
    public void doSwim(int pathLength) {
        if (pathLength > maxSwim) System.out.println(name + " утонул, потому что не умел плавать");
        else super.doSwim(pathLength);
    }
}

