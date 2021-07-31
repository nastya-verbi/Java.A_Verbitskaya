package Lesson06.online;

import Lesson05.online.models.Hero;
import Lesson06.online.model.Actor;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.07.2021
 */

public class Player extends Actor {

    private int countSteps;
    private int z;

    public Player(String name, int x, int y) {
        super(name, x, y);
        this.countSteps = 0;
    }

    public Player(String name, int x, int y, int z) {
        super(name, x, y);
        this.z = z;
    }

    public void moveUp() {
        y -= 1;
        countSteps++;
        System.out.println("Hero move Up");
    }

    public void moveDown() {
        y += 1;
        countSteps++;
        System.out.println("Hero move Down");
    }

    public void moveLeft() {
        x -= 1;
        countSteps++;
        System.out.println("Hero move Left");
    }

    public void moveRight() {
        x += 1;
        countSteps++;
        System.out.println("Hero move Right");
    }

    public void heal(int value) {
        healthPoint += value;
        System.out.println("Hero heal self on " + value + " point");
    }

    public int getCountSteps() {
        return countSteps;
    }

    @Override
    public void walk() {
        System.out.println("player walk!");
    }

    @Override
    public void sleep() {

    }

}
