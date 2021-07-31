package Lesson06.homework;

import Lesson06.homework.model.Animals;

public class AnimalsAPP {

    public static void main(String[] args) {

        Dog dog = new Dog("Бобик");
        Dog dog1 = new Dog("Шарик");
        Cat cat = new Cat("Снежок");
        Cat cat1 = new Cat("Пушок");
        Cat cat2 = new Cat("Барсик");


        dog.doRun(100);
        dog.doSwim(5);
        dog1.doRun(650);
        dog1.doSwim(15);
        cat.doRun(500);
        cat.doSwim(10);
        cat1.doRun(200);
        cat1.doSwim(5);
        cat2.doRun(0);
        cat2.doSwim(0);

        System.out.println("Количество всех животных: " + Animals.getCountAnimals());
        System.out.println("Количество собак: " + Cat.getCountCats());
        System.out.println("Количество котов: " + Dog.getCountDogs());
    }
}
