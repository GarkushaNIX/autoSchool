package Lesson4;

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
        String[] array = new String[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 8; i++){
            String s;
            s = scan.nextLine();
            array[i] = s;
        }

        for (int i = 9; i >= 0; i--){
            System.out.println(array[i]);
        }
    }

    //Третье задание

    private static void prog3(){
        String[] arrayS = new String[10];
        int[] arrayI = new int[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arrayS.length; i++){
            String s;
            s = scan.nextLine();
            arrayS[i] = s;
        }

        for (int i = 0; i < arrayS.length; i++){
            arrayI[i] = arrayS[i].length();
            System.out.println(arrayI[i]);
        }
    }

    //Четвёртое задание

    private static void prog4(){
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

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }

    //Пятое задание

    private static void prog5(){
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

        for (int i = 0; i < arraySmall2.length; i++){
            System.out.println(arraySmall2[i]);
        }
    }

}
