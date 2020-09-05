package LESSON_2;

import java.util.Arrays;
import java.util.Random;

public class LESSON_HW_2 {

    public static void main(String[] args) {
        //ДОМАШНЕЕ ЗАДАНИЕ К УРОКУ 2
        //Задание 1
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

        //Задание 2
        int[] arr1 = new int[8];
        arr1[0] = 0;
        for (int i = 0; i < (arr1.length - 1); i++) {
            arr1[i + 1] = arr1[i] + 3;
        }
        System.out.println(Arrays.toString(arr1));

        //Задание 3
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr2));

        //Задание 4
        int[][] arr3 = new int[5][5];
        for (int i = 0; i < arr3.length; i++) {
            for (int k = 0; k < arr3[i].length; k++) {
                if (i == k || (i + k) == (arr3.length - 1)) {
                    arr3[i][k] = 1;
                } else {
                    arr3[i][k] = 0;
                }
            }
        }
        printArr3(arr3);

        //Задание 5
        int[] arr4 = new int[20];
        for (int i = 0; i < arr4.length; i++) {
            Random random = new Random();
            arr4[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr4));
        int max = arr4[0];
        int min = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
            if (max < arr4[i]) {
                max = arr4[i];
            } else if (min > arr4[i]) {
                min = arr4[i];
            } else {
                max = max;
                min = min;
            }
        }
        System.out.println("Максимальный элемент - " + max);
        System.out.println("Минимальный элемент - " + min);

        //Задание 6
        //Данное задание оказалось для меня слишком сложным

        //Задание 7
        //Данное задание оказалось для меня черезчур сложным

    }


    // Метод печати двумерного массива для задания 4
    static void printArr3(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2s", arr[i][j]);
            }
            System.out.println();
        }
    }



/*
    static void printWord(int n, String word) {
        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    } // печать фразы

    static void printRectangle(int h, int w, char c) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    } // печать таблицы с указанными размерами (количество строк и столбцов) и заполнение символами

    static void printMultyTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    } // таблица умножения для указанного элемента

    static void newMethod(int n, int k) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.println(i + " " + j);
                if (i * j == 20) {
                    return;
                }
            }
        }
    } // выход из метода при выполнении условия (return)

    static void printArr2d(String[][] arr){
       for(int i = 0; i < arr.length; i++){
           for(int j = 0; j < arr[i].length; j++){
               System.out.printf("%10s", arr[i][j]);
           }
           System.out.println();
       }
    }

 */

}
