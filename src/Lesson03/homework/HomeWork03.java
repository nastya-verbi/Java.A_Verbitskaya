package Lesson03.homework;

public class HomeWork03 {

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArr(arr1);
        System.out.println();
        myArr1(arr1);
        printArr1(arr1);
        System.out.println();
        System.out.println();

        int[] arr2 = new int [100];
        myArr2(arr2);
        printArr1(arr2);
        System.out.println();
        System.out.println();

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArr1(arr3);
        System.out.println();
        myArr3(arr3);
        printArr1(arr3);
        System.out.println();
        System.out.println();

        int[][] arr4 = new int[5][5];
        tableDiagonal(arr4);
        printDoubleArr(arr4);
        System.out.println();
        System.out.println();

        printArr1(myReturnArr(10,5));
        System.out.println();
        System.out.println();

        int[] arr6 = {12, 5, 0, 2, 11, 4, -5, 2, 4, 8, 9, 1};
        minMax(arr6);
    }
    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    public static void printArr(int[] printArr) {
        for (int i = 0; i < printArr.length; i++) {
            System.out.print(printArr[i]  + " ");
        }
    }


    public static void myArr1(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == 1) {
                myArr[i] = 0;
            } else {
                myArr[i] = 1;
            }
        }
    }

    public static void printArr1(int[] printArr1) {
        for (int i = 0; i < printArr1.length; i++) {
            System.out.print(printArr1[i]  + " ");
        }
    }


    /**
     * 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */

    public static void myArr2(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i+1;
        }
    }


    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */

    public static void myArr3(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = (arr3[i]*2);
            }
        }
    }

    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */

    public static void tableDiagonal(int[][] arr4) {
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if ((i == j) || (i == arr4.length-(j+1))) {
                    arr4[i][j] = 1;
                }
            }
        }
    }

    public static void printDoubleArr(int[][] doubleArr) {
        for (int i = 0; i < doubleArr.length; i++) {
            for (int j = 0; j < doubleArr[i].length; j++) {
                System.out.print(doubleArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */

    public static int[] myReturnArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
    /**
     * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     */

    public static void minMax(int[] arr6) {
        int max = arr6[0];
        int min = arr6[0];
        for (int i = 1; i < arr6.length; i++) {
            if (arr6[i] > max) {
                max = arr6[i];
            }
            if (arr6[i] < min) {
                min = arr6[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }


    /**
     * 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
     * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     * **Примеры:
     * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
     * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
     * checkBalance([1, 1, 1, 1, 1, 1, 4 ||| 10]) → true, т.е. 1 + 1 + 1 = 2 + 1
     * checkBalance([1, 1, 10]) → false
     * граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
     */
    /**
     * 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
     * при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
     * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
     * При каком n в какую сторону сдвиг можете выбирать сами.
     */

}
