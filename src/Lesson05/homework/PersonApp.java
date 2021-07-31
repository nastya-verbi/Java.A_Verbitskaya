package Lesson05.homework;

import Lesson05.homework.models.Person;

public class PersonApp {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван Иванович", "Директор", "ivanov@gmail.com", 899988877, 100000, 50);
        persArray[1] = new Person("Сидоров Сидор Сидорович", "Фин.Директор", "sidorov@gmail.com", 899985544, 70000, 45);
        persArray[2] = new Person("Петров Петр Петрович", "Бухгалтер", "petrov@gmail.com", 899984455, 70000, 39);
        persArray[3] = new Person("Соколова Светлана Львовна", "Зам.Главбух", "sokolova@gmail.com", 899988855, 60000, 35);
        persArray[4] = new Person("Киселева Людмила Григорьевна", "Секретарь", "kiseleva@gmail.com", 899988877, 30000, 25);

        System.out.println("Сотрудники старше 40 лет:");
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) persArray[i].printPerson();
        }
    }
}
