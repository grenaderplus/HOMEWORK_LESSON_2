package LESSON_2;

import java.util.Arrays;
import java.util.Random;

public class LESSON_HW_2 {

    public static void main(String[] args) {

        //МАТЕРИАЛ УРОКА 2
/*     String[][] strArr = new String[2][2];
     String [][] strArr2 = {
             {"afa", "fgaerg", "djfgd"},
             {"jfakj", "syaysbv", "fjfjc"},
             {"urjcn", "yehdn", "wfywtef"},
     };
     printArr2d(strArr2);
*/ //двумерный массив
/*        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) - 5; // разброс для заполнения (максимальное значение) - минимальное значение
        }
        System.out.println(Arrays.toString(arr));
*/ //заполнение массива случайными числами
/*    int[] arr = {1,4,33,56,3,12,34,54,89,6,7};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 3 == 0){
               arr[i] /= 3;
            }
        }
        System.out.println(Arrays.toString(arr));
*/ //операции с содержимым массива
/*    String[] lineArr = new String[3];
    lineArr[0] = "Java";
    lineArr[1] = "Core";
    System.out.println(Arrays.toString(lineArr));
*/ //заполнение строкового массива элементами
/*        int[] a = {1,2,3};
        int[] b = {4,5,6};

        b = a;
        a[1] = 99;
        b[2] = 55;

        System.out.println(Arrays.toString(a));
*/ //ссылки на данные массивов
/*        int[] arr = new int[5];
        int newArr[] = {5,6,7};
        String[] strArr = new String[3];

        System.out.println(Arrays.toString(strArr));
        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i]+" ");
            newArr[i]++;
        }

        for(int x : newArr){
            System.out.print(x + " ");
        }
*/ //массивы, инициализация, вывод на экран
/*        int n = 10;
        switch (n) {
            case 12:
            case 1:
            case 2:
                System.out.println("WINTER");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("SPRING");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("SUMMER");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("AUTUMN");
                break;
            default:
                System.out.println("Incorrect input");
        }
*/ //оператор выбора switch - для выполнения действия при совпадении одного из нескольких условий
/*        newMethod(5,4);
*/ //вызов метода "новый метод"
/*        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                break;
            }
        }
 */ //выход из цикла привыполнении условия и переход к следующей после цикла строке кода
/*    for (int i = 0; i < 10; i++){
        if (i > 2 && i < 7) {
            continue;
        }
        System.out.println(i);
    }
 */ //переход к следующей итерации цикла при выпполнении условия (continue)
/*        int i = 2;
        int n = 10;
        do {
            System.out.println(i);
            i += 2;
        } while (i < n);
 */ //цикл с постусловием (do while)
/*    int n = 20;
    int k = 2;
    while (n > 1){
        while (n % k == 0){
            n /= k;
            System.out.print(k + " ");
        }
        k++;
    }
 */ //разложение числа на простые множители
/*      int n = 187539487;
      int k = 0;
      while (n>0){
          n /= 10;
          k++;
      }
        System.out.println(k);
*/ //вычисление количества цифр в числе
/*        int i = 100;
        while (i > 0){
            System.out.print(i + " ");
            i-=10;
        }
*/ //неопределенный цикл (while)
/*        int n = 97;
        for(int i = 1; i <=n; i++){
            if(n%i == 0){
                System.out.println(i + " ");

            }
        }
*/ //цикл с условием if
/*
        for ( ; ; ){
            System.out.println("Hello");
        }
 */ //бесконечный цикл
/*
        for (int i = 100; i > 0; i -=10){
            System.out.print(i + " ");
        }
 */ //отрицательное приращение на 10 единиц
/*
        for(int i = 0, n = 10; i<n; i++, n-=2){
            System.out.printf("i= %d n= %d \n", i, n);
        }
*/ //цикл с несколькими переменными
/*
      printMultyTable(20);
*/ //вызов метода "таблица умножения"
/*
      printRectangle(4,5,'A');
*/ //вызов метода "таблица"
/*
      for(int i = 0; i<3; i++){
        for(int j = 0; j<3; j++){
            System.out.printf("i = %d j = %d\n", i, j);
        }
    }
*/ //вложенный цикл
/*
        printWord(1,"Hello!");
*/ //вызов метода "печать текста"
/*
        System.out.println("Java");
        System.out.println("Java");
        System.out.println("Java");
        System.out.println("Java");
*/ //печать текста (вручную)
/*
        for (int i = 0; i <=5; i++){
            System.out.println("Java Core");
        }
*/ //печать текста (цикл)
/*
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
*/ //цикл
/*
        for (byte i = 100; i != 0; i++){
            System.out.print(i + " ");
        }
*/ //цикл с переменной типа байт
/*
        int i;
        for(i = 0; i<5;i++){
            System.out.println("A " + i);
        }

        System.out.println(i);
*/ //вынесение переменной за цикл (область видимости)

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
