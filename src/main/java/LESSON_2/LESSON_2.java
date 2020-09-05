package LESSON_2;

public class LESSON_2 {
    public static void main(String [] args){
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
    }
}
