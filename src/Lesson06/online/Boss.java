package Lesson06.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.07.2021
 */

public class Boss extends Enemy {

    private int defense;

    public Boss(String name, int x, int y, int attackPower, int defense) {
        super(name, x, y, attackPower);
        this.defense = defense;
    }

    @Override
     public void doSomething(String value, int valueInt) {
        super.getCoordinatesInfo();
        System.out.println(defense + " <<< Output value = " + value);
    }

    public void superAttack() {
        System.out.println("Super attack");
    }
}
