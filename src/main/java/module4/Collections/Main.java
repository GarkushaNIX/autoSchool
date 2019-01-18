package module4.Collections;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        prog1();
        System.out.println("\nNext program");
        prog2();
        System.out.println("\nNext program");
        prog3();
        System.out.println("\nNext program");
        prog4();
        System.out.println("\nNext program");
        prog5();
        System.out.println("\nNext program");
        prog6();
        System.out.println("\nNext program");
        prog7();
        System.out.println("\nNext program");
        prog8();
        System.out.println("\nNext program");
        prog9();
        System.out.println("\nNext program");
        prog10();
        System.out.println("\nNext program");
        prog11();
        System.out.println("\nNext program");
        prog12();
        System.out.println("\nNext program");
        prog13();
        System.out.println("\nNext program");
        prog14();
        System.out.println("\nNext program");
        prog15();
        System.out.println("\nNext program");
        prog16();
        System.out.println("\nNext program");
        prog17();

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

        System.out.println("List size is " + list.size());

        System.out.println("List content is ");
        for (String text : list) System.out.println(text);

    }

    private static void prog8() {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int maxLength = 0;

        System.out.println("Enter 5 different strings");
        for (int i = 0; i < 5; i++) {
            list.add(scan.nextLine());
            if (list.get(i).length() > maxLength) maxLength = list.get(i).length();
        }

        System.out.println("Longest strings are:");
        for (String s : list) {
            if (s.length() == maxLength) System.out.println(s);
        }

    }

    private static void prog9() {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int minLength = 256;

        System.out.println("Enter 5 different strings");
        for (int i = 0; i < 5; i++) {
            list.add(scan.nextLine());
            if (list.get(i).length() < minLength) minLength = list.get(i).length();
        }

        System.out.println("Shortest strings are:");
        for (String s : list) {
            if (s.length() == minLength) System.out.println(s);
        }

    }

    private static void prog10() {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 different strings");
        for (int i = 0; i < 10; i++) list.add(0, scan.nextLine());

        System.out.println("Content of the List:");
        for (String s : list) System.out.println(s);

    }

    private static void prog11() {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 different strings");
        for (int i = 0; i < 5; i++) list.add(scan.nextLine());

        for (int i = 0; i < 13; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }

        System.out.println("List after 13 transpositions");
        for (String s : list) System.out.println(s);

    }

    private static void prog12() {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < 20; i++) set.add("Л" + i);


        for (String s : set) System.out.println(s);
    }

    private static void prog13() {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) set.add(random.nextInt(30 + 1));

        set.removeIf(integer -> integer > 10);

        System.out.println("Set after removing all numbers above 10");
        for (Integer s : set) System.out.println(s);

    }

    private static void prog14() {
        Map<String, String> map = new HashMap<String, String>();
        Random random = new Random();
        String lastName = "LastName7";
        String firstName = "FirstName5";

        while (map.size() < 10) map.put("LastName" + random.nextInt(20 + 1), "FirstName" + random.nextInt(20 + 1));

        int counter = 0;

        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName) || pair.getValue().equals(firstName)) counter++;
        }

        System.out.println("Amount of people with entered name of lastname" + counter);
    }

    private static void prog15() {
        Map<String, LocalDate> map = new HashMap<String, LocalDate>();
        Random random = new Random();
        LocalDate date;
        String name;
        Set<String> keysSet = new HashSet<String>();

        while (map.size() < 10) {
            name = "LastName" + random.nextInt(100 + 1);
            date = LocalDate.of((random.nextInt(80) + 1935),
                    (random.nextInt(12) + 1), (random.nextInt(28) + 1));
            map.put(name, date);
        }

        for (Map.Entry<String, LocalDate> pair : map.entrySet()) {
            String key = pair.getKey();
            LocalDate value = pair.getValue();
            keysSet.add(key);
            System.out.println(key + " " + value);
        }

        System.out.println("\nAfter deleting all summer-born\n");

        for (String key : keysSet) {
            LocalDate value = map.get(key);

            if (value.getMonthValue() > 5 && value.getMonthValue() < 9) {
                map.remove(key);
            } else System.out.println(key + " " + value);
        }

    }

    private static void prog16() {
        Map<String, String> map = new HashMap<String, String>();
        Random random = new Random();
        Set<String> keysSet = new HashSet<String>();

        while (map.size() < 10) {
            map.put("LastName" + random.nextInt(30 + 1), "FirstName" + random.nextInt(20 + 1));
        }

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " " + value);
        }

        for (Map.Entry<String, String> pair : map.entrySet()) {
            for (Map.Entry<String, String> pairToCompare : map.entrySet()) {
                if (!(pair.getKey().equals(pairToCompare.getKey())) && pair.getValue().equals(pairToCompare.getValue())) {
                    keysSet.add(pair.getKey());
                    keysSet.add(pairToCompare.getKey());
                }
            }
        }

        System.out.println("\nAfter deleting all clones\n");

        for (String key : keysSet) map.remove(key);

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " " + value);
        }

    }

    private static void prog17() {
        Map<String, String> map = new HashMap<String, String>();
        Random random = new Random();

        map.put("Иванов", "Иван");
        map.put("Иванов1", "Александр");
        map.put("Иванов2", "Пётр");
        map.put("Иванов3", "Алексей");
        map.put("Иванов4", "Иннокентий");
        map.put("Иванов5", "Иван");
        map.put("Иванов6", "Александр");
        map.put("Иванов7", "Пётр");
        map.put("Иванов8", "Алексей");
        map.put("Иванов", "Иннокентий");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " " + value);
        }

    }

}
