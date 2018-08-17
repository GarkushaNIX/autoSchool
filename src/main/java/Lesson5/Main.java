package Lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //prog1();
        //prog2();
        //prog3();
        //prog4();
        //prog5_6();
        //prog7();
        //prog8();
        //prog9();
        prog10();
    }

    private static void prog1(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a < b) System.out.println("Минимальное число: " + a);
        else System.out.println("Минимальное число: " + b);
    }

    private static void prog2(){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[4];

        for (int i=0; i<4; i++){
            array[i] = scan.nextInt();
        }

        int maximum = array[0];

        for (int i=1; i<4; i++){
            if (array[i] > maximum) maximum = array[i];
        }

       System.out.println("Максимальное число: " + maximum);
    }

    private static void prog3(){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];

        for (int i=0; i<3; i++){
            array[i] = scan.nextInt();
        }

        Arrays.sort(array);

        for (int i=0; i<3; i++){
            System.out.println(array[i]);
        }
        System.out.println("Максимальное число: " );
    }

    private static void prog4(){
        Scanner scan = new Scanner(System.in);
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();

        if (name1.equals(name2)) System.out.println("Имена идентичны");
        else if (name1.length() == name2.length()) System.out.println("Длины имен равны");
    }

    private static void prog5_6(){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();

        if (age<18) System.out.println("Подрасти еще");
        if (age>20) System.out.println("И 18-ти достаточно");
    }

    private static void prog7(){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(20 + 1);
        int guess;

        for (int i=0; i<7; i++){
            guess = scan.nextInt();
            if (guess == secret) {
                System.out.println("Угадал :)");
                return;
            }
            if (guess < secret) System.out.println("Мало");
            if (guess > secret) System.out.println("Много");
        }

        System.out.println("Не угадал :(");
    }

    private static void prog8(){
        int i=1;
        while (i<11){
            System.out.println(i);
            i++;
        }
    }

    private static void prog9(){
        int i=10;
        while (i>0){
            System.out.println(i);
            i--;
        }
    }

    private static void prog10(){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = scan.nextInt();

        while (n>0){
            System.out.println(str);
            n--;
        }
    }



}