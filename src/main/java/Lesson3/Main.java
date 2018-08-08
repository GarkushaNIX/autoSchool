package Lesson3;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        prog1("qwert asd asd asd a.dgf dg.");
        System.out.println();
        prog2();
        System.out.println();
        prog3("qwert asd asdsss asd123 a.dgf dg.");
    }

    private static void prog1(String str){
        System.out.println("Первый символ "+ str.charAt(0));
        System.out.println("Последний символ "+ str.charAt(str.length()-1));
        if (str.length()%2 != 0) {
            System.out.println("Средний символ "+ str.charAt(str.length()/2));
        }

        String first;
        first=str.contains(".") ? str.substring(0,str.indexOf(".")+1) : str;

        System.out.println("Первое предложение до точки: "+ first);

        int n = str.split(" ").length - 1;
        System.out.println("Количество пробелов равно " + n);
    }

    private static void prog2(){
        String find = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите строку");

        String str = scan.nextLine();

        System.out.println("Что нужно найти?");
        for (int i=0; i<3; i++) {
            find = scan.nextLine();
            if (str.contains(find)) break;
            System.out.println("Нет такой подстроки, количество оставшихся попыток: " + (2-i));
            if (i==2) return;
        }
        System.out.println("Чем нужно заменить?");
        String repl = scan.nextLine();
        str = str.replace(find,repl);
        System.out.println("Результат замены: " + str);
    }

    private static void prog3(String str){
        int pos = 0;

        String[] array = str.split(" ");
        for (int i=0; i<array.length; i++){
            if (array[i].length() > array[pos].length()) pos = i;
        }

        System.out.println("Самое длинное слово: " + array[pos]);
    }
}
