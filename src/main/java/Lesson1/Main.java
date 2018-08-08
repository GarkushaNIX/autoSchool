package Lesson1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args ){
        System.out.println("Hello, World!");
        printHelloName();
    }

    public static void printHelloName(){
        System.out.println("Name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello, "+ name);
    }
}
