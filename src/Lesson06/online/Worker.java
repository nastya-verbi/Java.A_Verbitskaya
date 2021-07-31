package Lesson06.online;

import Lesson05.online.models.Hero;
import Lesson06.online.model.Actor;

import java.util.Random;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.07.2021
 */

public class Worker {

    public static void main(String[] args) {

//        byte byte1 = 120;
//        int int1 = byte1;
//        System.out.println("int1 > " + int1);
//
//        int int2 = 56546546;
//        byte byte2 = (byte)int2; // type casting
//        System.out.println("byte2 > " + byte2);
        Player player = new Player("Gamer1", 2, 4);
        Enemy enemy = new Enemy("Enemy", 4, 6, 15);
        Player playerTest = new Player("Test", 4, 7);
        Boss boss = new Boss("Boss", 99, 151, 35, 45);
//        System.out.println(player.getName() + " " + player.getCoordinatesInfo());
//        player.speak();
//        player.moveUp();
//        System.out.println(player.getName() + " " + player.getCoordinatesInfo());
//
//        Player player1 = new Player("Gamer2", 12, 14, 99);
//        player1.speak();
//
//        enemy.speak();

//
//        System.out.println("playerTest.getName() > " + playerTest.getName());
//
//
//        System.out.println(boss.getCoordinatesInfo());
//
//        boss.doSomething("Qwerty", 67);
//        Actor actor = new Actor("Actor", 84, 98);

//        Actor[] gameActors = {player, enemy, playerTest, boss};
//
//        for (int i = 0; i < gameActors.length; i++) {
//            gameActors[i].speak();
//            System.out.println(gameActors[i].getName() + " > " + gameActors[i].getCoordinatesInfo());
//            if (gameActors[i] instanceof Boss) {
////                ((Boss)gameActors[i]).superAttack();
//                Boss tmpBoss = (Boss) gameActors[i];
//                tmpBoss.superAttack();
//            }
////            gameActors[i].getAttackPower();
//        }

//        boss.superAttack();

//        player.speak();
//        enemy.speak();
//        playerTest.sleep();
//        boss.sleep();

//        int abc = 15;
//        float cde = 15.0f;
//        String testString = "Hello";
//        Hero hero = new Hero("TestHero");
//
//        Object[] myObjects = {abc, cde, playerTest, testString, hero};
//
//        for (int i = 0; i < myObjects.length; i++) {
//            if (myObjects[i] instanceof Integer) {
//                System.out.println((((Integer) myObjects[i]).toString()));
//            }
//        }

    }
}
