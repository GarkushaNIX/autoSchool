package Lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        prog1();
        prog2();
        prog3();
        prog4();
        prog5_6();
        prog7();
        prog8();
        prog9();
        prog10();
        prog11();
        prog12();
        prog13();
        prog14();
        prog15();
        prog16();
        prog17();
        prog18();
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

    private static void prog11(){
        int n = 10;
        int m = 10;

        while (n>0){
            while (m>0){
                System.out.print("S");
                m--;
            }
            System.out.println();
            n--;
            m=10;
        }
    }

    private static void prog12(){
        int n = 1;
        int m = 1;

        while (n<11){
            while (m<11){
                System.out.print(n*m + " ");
                m++;
            }
            System.out.println();
            n++;
            m=1;
        }
    }

    private static void prog13(){
        for (int i=2;i<=100;i++){
            System.out.print(i + " ");
            i++;
        }
    }

    private static void prog14(){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("8");
            }
            System.out.println();
        }
    }

    private static void prog15(){
        int n = 1;

        for (int i=1;i<11;i++){
            for (int j=0;j<i;j++){
                System.out.print("8");
            }
            System.out.println();
        }
    }

    private static void prog16(){
        for (int i=0;i<10;i++){
            System.out.print("8");
        }

        System.out.println();

        for (int i=0;i<10;i++){
            System.out.println("8");
        }
    }

    private static void prog17(){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        for (int i=0;i<10;i++){
            System.out.println(name + " любит меня");
        }
    }

    private static void prog18(){
        for (int i=30;i>=0;i--){
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Бум!");
    }
}