package lesson01;

//Задание 1
public class HomeWorkApp {

    //Задание 6. Значения переменных задаются здесь
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(10,-30);
        printColor(101);
        compareNumbers(25, 40);
    }

    //Задание 2. Попробовала сделать код компактнее
    public static void printThreeWords() {
        System.out.println("Orange" + "\n" +"Banana" + "\n" + "Apple");
    }

    //Задание 3. Переменные объявила в параметрах, чтобы значения менять в мейне для удобства
    public static void checkSumSign(int a, int b) {
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //Задание 4. Решила сделать последовательность  if-else-if-..., мне кажется, что так "красивее" :)
    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    //Задание 5. Аналогично с заданием 3 - переменные в параметрах
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}