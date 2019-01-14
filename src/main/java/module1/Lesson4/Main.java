package module1.Lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        prog1();
        prog2();
        prog3();
        prog4();
        prog5();
    }

    //Первое задание

    private static void prog1(){
        System.out.println("Задание номер 1");
        System.out.println("Введите 20 натуральных чисел");
        int[] array = initializeArray();
        max(array);
    }

    private static int[] initializeArray(){
        int[] array = new int[20];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            int s;
            s = scan.nextInt();
            array[i] = s;
        }

        return array;
    }

    private static void max(int[] array){
        int maximum = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] > array[maximum]) maximum=i;
        }

        System.out.println("Максимальное число массива: " + array[maximum]);
    }

    //Второе задание

    private static void prog2(){
        System.out.println("Задание номер 2");
        System.out.println("Введите 8 строк");
        String[] array = new String[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 8; i++){
            String s;
            s = scan.nextLine();
            array[i] = s;
        }

        System.out.println("Содержимое массива в обратном порядке:");
        for (int i = 9; i >= 0; i--){
            System.out.println(array[i]);
        }
    }

    //Третье задание

    private static void prog3(){
        System.out.println("Задание номер 3");
        System.out.println("Введите 10 строк разной длины");
        String[] arrayStr = new String[10];
        int[] arrayInt = new int[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arrayStr.length; i++){
            String s;
            s = scan.nextLine();
            arrayStr[i] = s;
        }

        System.out.println("Массив длин введённых строк:");
        for (int i = 0; i < arrayStr.length; i++){
            arrayInt[i] = arrayStr[i].length();
            System.out.println(arrayInt[i]);
        }
    }

    //Четвёртое задание

    private static void prog4(){
        System.out.println("Задание номер 4");
        System.out.println("Введите 10 натуральных чисел");
        int[] array = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            int s;
            s = scan.nextInt();
            array[i] = s;
        }

        for (int i = 0; i < 5; i++){
            int pool = array[i];
            array[i] = array[9-i];
            array[9-i] = pool;
        }

        System.out.println("Массив в обратном порядке:");
        for (int i1 : array) {
            System.out.println(i1);
        }

    }

    //Пятое задание

    private static void prog5(){
        System.out.println("Задание номер 5");
        System.out.println("Введите 20 натуральных чисел");
        int[] arrayBig = new int[20];
        int[] arraySmall1 = new int[10];
        int[] arraySmall2 = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arrayBig.length; i++){
            int s;
            s = scan.nextInt();
            arrayBig[i] = s;
        }

        for (int i = 0; i < arrayBig.length; i++){
            if (i<10) arraySmall1[i]=arrayBig[i];
            else arraySmall2[i-10]=arrayBig[i];
        }

        System.out.println("Второй массив:");
        for (int i1 : arraySmall2) {
            System.out.println(i1);
        }
    }

}
