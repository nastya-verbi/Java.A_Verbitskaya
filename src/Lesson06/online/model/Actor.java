package Lesson06.online.model;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.07.2021
 */

public abstract class Actor {

    protected String name;
    protected int x;
    protected int y;
    protected int healthPoint;

    public Actor(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.healthPoint = 100;
    }

    public void speak() {
        System.out.println("Hello, my name is " + name);
    }

    public String getCoordinatesInfo(){
        return "[" + x + ":" + y + "]";
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void doSomething(String value, int int1) {
        System.out.println(name + " > Input value = " + value);
    }

    public abstract void walk();

    public abstract void sleep();
}
