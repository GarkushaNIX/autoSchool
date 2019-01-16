package module4.Collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        prog1();
//        prog2();
//        prog3();
//        prog4();
//        prog5();
//        prog6();
//        prog7();
//        prog8();
//        prog9();
//        prog10();
//        prog11();
//        prog12();
        prog13();


    }

    private static void prog1() {
        HashSet<String> collection = new HashSet<>();

        collection.add("арбуз");
        collection.add("банан");
        collection.add("вишня");
        collection.add("груша");
        collection.add("дыня");
        collection.add("ежевика");
        collection.add("жень-шень");
        collection.add("земляника");
        collection.add("ирис");
        collection.add("картофель");

        for (String x : collection) System.out.println(x);
    }

    private static void prog2() {
        Map<String, String> map = new HashMap<>();

        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : map.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());

    }

    private static void prog3() {
        Map<String, Cat> map = new HashMap<>();

        Cat cat;

        for (int i = 0; i < 10; i++) {
            cat = new Cat("Cat" + i);
            map.put(cat.getName(), cat);
        }

        for (Map.Entry<String, Cat> pair : map.entrySet()) System.out.println(pair.getKey() + " - " + pair.getValue());

    }

    private static void prog4() {
        Map<String, String> map = new HashMap<>();

        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : map.entrySet())
            System.out.println(pair.getKey());

    }

    private static void prog5() {
        Map<String, String> map = new HashMap<>();

        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : map.entrySet())
            System.out.println(pair.getValue());

    }

    private static void prog6() {
        Map<String, Object> map = new HashMap<>();

        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, Object> pair : map.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());

    }

    private static void prog7() {
        List<String> list = new ArrayList<>();

        list.add("qwe");
        list.add("asd");
        list.add("zxc");
        list.add("rty");
        list.add("fgh");

        System.out.println(list.size());

        for (String text : list) System.out.println(text);

    }

    private static void prog8() {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int maxLength = 0;

        for (int i = 0; i < 5; i++) {
            list.add(scan.nextLine());
            if (list.get(i).length() > maxLength) maxLength = list.get(i).length();
        }

        for (String s : list) {
            if (s.length() == maxLength) System.out.println(s);
        }

    }

    private static void prog9() {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int minLength = 256;

        for (int i = 0; i < 5; i++) {
            list.add(scan.nextLine());
            if (list.get(i).length() < minLength) minLength = list.get(i).length();
        }

        for (String s : list) {
            if (s.length() == minLength) System.out.println(s);
        }

    }

    private static void prog10() {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) list.add(0, scan.nextLine());

        for (String s : list) System.out.println(s);

    }

    private static void prog11() {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) list.add(scan.nextLine());

        for (int i = 0; i < 13; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }

        for (String s : list) System.out.println(s);

    }

    private static void prog12() {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < 20; i++) set.add("Л"+i);
    }

    private static void prog13() {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) set.add(random.nextInt(30 + 1));

        set.removeIf(integer -> integer > 10);

        for (Integer s : set) System.out.println(s);


    }

}
