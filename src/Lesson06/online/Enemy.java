package Lesson06.online;

import Lesson06.online.model.Actor;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.07.2021
 */

public class Enemy extends Actor {

    private int attackPower;

    public Enemy(String name, int x, int y, int attackPower) {
        super(name, x, y);
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public void walk() {
        System.out.println("enemy walk-walk!");
    }

    @Override
    public void sleep() {

    }
}
