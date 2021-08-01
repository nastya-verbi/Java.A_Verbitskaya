package Lesson06.homework;

import Lesson06.homework.model.Animals;

public class AnimalsAPP {

    public static void main(String[] args) {

        Dog dog = new Dog("Бобик", 500, 10);
        Dog dog1 = new Dog("Шарик", 500, 10);
        Cat cat = new Cat("Снежок", 200, 0);
        Cat cat1 = new Cat("Пушок", 200, 0);

        dog.doRun(100);
        dog.doSwim(5);
        dog1.doRun(650);
        dog1.doSwim(15);
        cat.doRun(500);
        cat.doSwim(10);
        cat1.doRun(0);
        cat1.doSwim(0);

        System.out.println("Количество всех животных: " + Animals.getCountAnimals());
        System.out.println("Количество собак: " + Cat.getCountCats());
        System.out.println("Количество котов: " + Dog.getCountDogs());
    }
}
