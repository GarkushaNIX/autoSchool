package Lesson2;

public class Main {
    public static void main (String[] args){
        prog1(21,8);
        prog2(97);
        prog3(3.14);
        prog4(0,2,5);
    }

    private static void prog1(int q, int w){
        System.out.println("Результат деления " + q/w);
        System.out.println("Остаток от деления " + q%w);
    }

    private static void prog2(int n){
        if (Integer.toString(n).length() != 2) {
            System.out.println("Число не двузначное");
            return;
        }
        int answer = (n/10)+(n%10);
        System.out.println("Сумма цифр числа равна " + answer);
    }

    private static void prog3(double n){
        int answer = (int)n;
        System.out.println("Результат округления равен " + answer);
    }

    private static void prog4(int a, int b, int c){
        c += a + b;
        a += b;
        b = c - a*2 + b;
        System.out.println("Новые значения: a = " + a + ", b = " + b + ", c = " + c);
    }
}
