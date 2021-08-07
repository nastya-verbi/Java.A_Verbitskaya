package Lesson06.homework.model;

public class Animals {

    protected String name;
    protected int maxRun;
    protected int maxSwim;
    protected int pathLength;
    private static int count = 0;

    public Animals(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        count++;
      }

    public String getName() { return name; }
    public int getPathLength() { return pathLength; }

    public static int getCountAnimals() {
        return count;
    }

    public void doRun(int pathLength) {
        if (pathLength > maxRun) System.out.println(name + " пробежал только " + maxRun +
                "м. Остальные " + (pathLength - maxRun) + "м не осилил");
        else if (pathLength == 0) System.out.println(name + " не побежал");
        else System.out.println(name + " пробежал " + pathLength + " метров");
    }

    public void doSwim(int pathLength) {
        if (pathLength > maxSwim) System.out.println(name + " проплыл только " + maxSwim +
                "м. Остальные " + (pathLength - maxSwim) + "м не осилил");
        else if (pathLength == 0) System.out.println(name + " не поплыл");
        else System.out.println(name + " проплыл " + pathLength + " метров");
    }
}
