package Lesson06.homework;

import Lesson06.homework.model.Animals;

public class Dog extends Animals {
    private int maxRun = 500;
    private int maxSwim = 10;
    private static int count = 0;

    public Dog(String name) {
        super(name);
        count++;
    }

    public static int getCountDogs() {
        return count;
    }

    @Override
    public void doRun(int pathLength) {
           if (pathLength > maxRun)
               System.out.println(name + " пробежал только 500м. Остальные " + (pathLength - maxRun) + "м не осилил");
           else super.doRun(pathLength);
    }

    @Override
    public void doSwim(int pathLength) {
        if (pathLength > maxSwim)
            System.out.println(name + " проплыл только 10м. Остальные " + (pathLength - maxSwim) + "м не осилил");
        else super.doSwim(pathLength);
    }
}
