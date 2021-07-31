package Lesson05.homework.models;

public class Person {

    public String fullName;
    public String position;
    public String email;
    public int phone;
    public int pay;
    public int age;

    public Person(String fullName, String position, String email, int phone, int pay, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    public void printPerson() {
        System.out.println("ФИО: " + fullName + " Должность: " + position + " email: " + email + " Телефон: " + phone +
                " Зарплата: " + pay + " Возраст: " + age);
           }
}
