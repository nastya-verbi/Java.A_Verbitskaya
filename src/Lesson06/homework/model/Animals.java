package Lesson06.homework.model;

public class Animals {

    protected String name;
    protected int pathLength;
    private static int count = 0;

    public Animals(String name) {
        this.name = name;
        count++;
      }

    public String getName() { return name; }
    public int getPathLength() { return pathLength; }

    public static int getCountAnimals() {
        return count;
    }

    public void doRun(int pathLength) {
        this.pathLength = pathLength;
        if (pathLength > 0) System.out.println(name + " пробежал " + pathLength + " метров");
        else System.out.println(name + " не побежал");
    }

    public void doSwim(int pathLength) {
        this.pathLength = pathLength;
        if (pathLength > 0) System.out.println(name + " проплыл " + pathLength + " метров");
        else System.out.println(name + " не поплыл");
    }
}
