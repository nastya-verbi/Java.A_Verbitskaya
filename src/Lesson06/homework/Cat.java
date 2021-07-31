package Lesson06.homework;

import Lesson06.homework.model.Animals;

public class Cat extends Animals {
    private int maxRun = 200;
    private static int count = 0;


    public Cat(String name) {
        super(name);
        count++;
    }

    public static int getCountCats() {
        return count;
    }

    @Override
    public void doRun(int pathLength) {
        if (pathLength > maxRun)
            System.out.println(name + " пробежал только 200м. Остальные " + (pathLength - maxRun) + "м не осилил");
        else super.doRun(pathLength);
    }

    @Override
    public void doSwim(int pathLength) {
        if (pathLength > 0) System.out.println(name + " утонул, потому что не умел плавать");
        else super.doSwim(pathLength);
    }
}

