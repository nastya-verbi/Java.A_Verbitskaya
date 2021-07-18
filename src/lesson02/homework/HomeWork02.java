package lesson02.homework;

public class HomeWork02 {

    public static void main(String[] args) {

        System.out.println("Задание 1");
        System.out.println(compare1v1(12, 2));
        System.out.println(compare1v2(5, 5));
        System.out.println();
        System.out.println("Задание 2");
        compare2v1(0);
        compare2v2(-7);
        System.out.println();
        System.out.println("Задание 3");
        System.out.println(compare3v1(-7));
        System.out.println(compare3v2(9));
        System.out.println();
        System.out.println("Задание 4");
        printString1("Строка номер ", 3);
        System.out.println("******************************");
        printString2("Строка номер ", 5);
        System.out.println();
        System.out.println("Задание 5*");
        System.out.println(leapYear(2021));
        System.out.println(leapYearTer(2016));
    }

//    1. Написать метод, принимающий на вход два целых числа и проверяющий,
//    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//    в противном случае – false.
//    1 вариант - через if

    public static boolean compare1v1(int valueA, int valueB) {
        if ((valueA + valueB) >= 10 && (valueA + valueB) <= 20) {
            return true;
        }
        return false;
    }

//    2 вариант - через тернарный оператор

    public static boolean compare1v2(int valueA, int valueB) {
        return  ((valueA + valueB) >= 10 && (valueA + valueB) <= 20) ? true : false;
    }

//    2. Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//    Замечание: ноль считаем положительным числом.
//    1 вариант - через if

    public static void compare2v1(int valueA) {
        if (valueA >= 0) {
            System.out.println("Число " + valueA + " - положительное");
        } else {
            System.out.println("Число " + valueA + " - отрицательное");
        }
    }

//    2 вариант - через тернарный оператор

    public static void compare2v2(int valueA) {
        System.out.println((valueA >= 0) ? "Число " + valueA + " - положительное" : "Число " + valueA + " - отрицательное");
    }

//     3. Написать метод, которому в качестве параметра передается целое число.
//     Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
//    1 вариант - через if

    public static boolean compare3v1(int valueA) {
        if (valueA < 0) {
            return true;
        }
        return false;
    }

//    2 вариант - через тернарный оператор

    public static boolean compare3v2(int valueA) {
        return (valueA <= 0) ? true : false;
    }

//    4. Написать метод, которому в качестве аргументов передается строка и число,
//    метод должен отпечатать в консоль указанную строку, указанное количество раз;
//    1 вариант - через for
    public static void printString1(String text, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(text + i);
        }
    }

//    1 вариант - через while

    public static void printString2(String text, int count) {
        int i = 1;
        while (i <= count) {
            System.out.println(text + i);
            i++;
        }
    }

//     5.* Написать метод, который определяет, является ли год високосным,
//     и возвращает boolean (високосный - true, не високосный - false).
//     Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

//     Делала, применяя деление по модулю. В свое время проходила JavaRush, там была эта тема.
//     1 вариант - через if

    public static boolean leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

//     2 вариант - через тернарный оператор

    public static boolean leapYearTer(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true : false;
    }
}
